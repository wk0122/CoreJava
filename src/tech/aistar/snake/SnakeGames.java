package tech.aistar.snake;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/18 0018
 */
public class SnakeGames {

    public static void main(String[] args) {
        SnakeGames snakeGames = new SnakeGames();
        Snake snake = snakeGames.getSnake();

        Scanner sc = new Scanner(System.in);
        do {
            snakeGames.printMenu();
            String dir = sc.nextLine();
            switch (dir){
                case "w":
                    snake.move(Snake.UP);
                    break;
                case "s":
                    snake.move(Snake.DOWN);
                    break;
                case "a":
                    snake.move(Snake.LEFT);
                    break;
                case "d":
                    snake.move(Snake.RIGHT);
                    break;
                default:
                    snake.move();
            }
            if(snakeGames.foods.size()==0){
                System.out.println("恭喜通关!");
                snakeGames.printMenu();
                break;
            }
        }while(true);

    }

    //选取数据结构
    private Set<Node> foods = new HashSet<>();

    //声明一个蛇的对象
    private Snake snake;

    //定义行和列
    private final int rows = 20;

    private final int cols = 20;

    //构造方法
    public SnakeGames(){
        //初始化蛇
        snake = new Snake();
        //初始化食物
        initFoods(3);
    }

    public Snake getSnake() {
        return snake;
    }

    private void initFoods(int n) {
        //随机生成x和y
        do{
            //x纵 - [1-18]
            int i = (int) (Math.random()*(cols-2)+1);
            int j = (int) (Math.random()*(rows-2)+1);

            //加入snakes已经包含了i,j
            if(snake.contains(i,j)){
                continue;
            }
            foods.add(new Node(i,j));

        }while(foods.size()<3);
    }

    //输出游戏界面
    public void printMenu(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(i == 0 || i == rows -1 || j==0 || j== cols - 1){
                    System.out.printf("%3s","*");
                }else if(snake.contains(i,j)){
                    System.out.printf("%3s","#");
                }else if(foods.contains(new Node(i,j))){
                    System.out.printf("%3s","0");
                } else{
                    System.out.printf("%3s"," ");
                }
            }
            System.out.println();
        }
        System.out.println("w->上 d->右 a->左 s->下");
    }

    //内部类 - 蛇
    class Snake{
        //存放蛇身
        private LinkedList<Node> snakes = new LinkedList<>();

        //提供方向
        public int dir;

        public static final int UP = -1;

        public static final int DOWN = 1;

        public static final int LEFT = -2;

        public static final int RIGHT = 2;

        //构造 - 手动初始化一个蛇身
        public Snake(){
            //初始化蛇身 - 添加节点.
            snakes.add(new Node(5,6));//x纵  y横
            snakes.add(new Node(6,6));
            snakes.add(new Node(7,6));
            snakes.add(new Node(7,5));
            snakes.add(new Node(7,4));
            snakes.add(new Node(8,4));
            snakes.add(new Node(9,4));

            //初始化方向
            dir = UP;
        }

        //判断蛇身中是否包含i,j的坐标
        public boolean contains(int i,int j){
            //主要是equals和hashcode指定了i,j
            return snakes.contains(new Node(i,j));
        }

        public void move(int dir){
            //判断是否反方向移动
            if(this.dir + dir == 0){
                throw new RuntimeException("sorry,不能反方向移动!");
            }
            this.dir = dir;
            move();//走一步的方法.
        }

        //移动 - 走一步...
        public void move() {
            //获取蛇头.
            Node head = snakes.getFirst();
            int x = head.getX();//4
            int y = head.getY();//3

            switch (dir){
                case UP:
                    x--;
                    break;
                case DOWN:
                    x++;
                    break;
                case LEFT:
                    y--;
                    break;
                case RIGHT:
                    y++;
                    break;
            }
            //头的左边必然会发生改变
            head = new Node(x,y);

            //判断head是否撞墙了.
            if(head.getX() == 0 || head.getX()==rows-1 || head.getY()== 0 || head.getY()== cols-1){
                throw new RuntimeException("撞墙了!Game Over!");
            }

            snakes.addFirst(head);

            //如果吃到食物了,食物的集合需要少掉一个
            if(foods.remove(head)){//如果head的节点正好就是食物的节点,那么就返回true
                return;
            }

            //吃到食物就不删除尾部 - 最后一个节点
            snakes.removeLast();
        }
    }
}
