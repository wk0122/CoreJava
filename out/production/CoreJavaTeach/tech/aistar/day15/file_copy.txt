package tech.aistar.day15;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.UUID;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/16 0016
 */
public class FileDemo {

    /**
     * 测试文件的创建
     */
    @Test
    public void testCreateNewFile(){

        //1. 构建出一个文件的实例对象
        //File file = new File("e:/file1.txt");//绝对路径

        //File file = new File("file.txt");//相对路径 - src的根目录

        String filename = UUID.randomUUID().toString();
        System.out.println(filename);

        File file = new File("src/tech/aistar/day15/aa.txt");

        //2. 判断文件是否存在
        if(file.exists()){
            System.out.println("sorry"+file+"已经存在了!");
            return ;
        }

        //判断file是为文件实例
        if(!file.isFile()){
            System.out.println(file);
            System.out.println("不是一个文件实例!");
            return;
        }

        //3. 调用文件创建的方法
        //boolean createNewFile();
        try {
            if(file.createNewFile()){//创建成功,则返回true
                System.out.println(file+"创建成功!");

                //获取父目录的绝对路径
                System.out.println("父目录:"+file.getParent());
                System.out.println("文件名称:"+file.getName());
                System.out.println("绝对路径:"+file.getAbsolutePath());
                System.out.println("pathname路径:"+file.getPath());

            }else{
                System.out.println(file+"创建失败!可能没有权限!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /***
     * 演示创建目录
     */
    @Test
    public void mkDirs(){
        //1. 构建目录的File实例
        File file = new File("e:/c/d/e");

        //判断是否为文件实例
        //System.out.println(file.isFile());

        //判断是否为目录实例
        //System.out.println(file.isDirectory());

        //判断目录是否存在
        if(file.exists()){
            System.out.println(file+"已经存在了!");
            return;
        }

        //boolean mkdir();//创建单层次的目录
        //if(file.mkdir()){
         if(file.mkdirs()){//可以创建深层次的目录
            System.out.println(file+"目录创建成功!");

            //获取父目录的绝对路径
            System.out.println("父目录:"+file.getParent());
            System.out.println("目录名称:"+file.getName());
            System.out.println("绝对路径:"+file.getAbsolutePath());
            System.out.println("pathname路径:"+file.getPath());
        }else{
            System.out.println("目录创建失败!");
        }
    }

    /**
     * 删除File实例
     * 只能删除文件或者空目录
     * 注意:非空目录是不能够直接被删除的,如果需要删除非空目录,则需要使用递归算法 - 作业
     */
    @Test
    public void testDelete(){
        //1. 构建目录的File实例
        File file = new File("e:/c/hello.txt");

        //2. 判断是否存在
        if(!file.exists()){
            System.out.println(file+"不存在!删除失败!");
            return;
        }
        //boolean delete()
        if(file.delete()){
            System.out.println(file+"删除成功!");
        }else{
            System.out.println("删除失败!可能是非空目录或者权限不足!");
        }
    }

    /**
     * 作业 - 给定一个目录,将该目录下的所有的file全部输出
     *
     * 遍历目录[第一层] - 如果是文件直接输出文件名
     *            如果是目录直接输出该目录的绝对地址
     *
     *  String[] list(FilenameFilter filter);
     *  File[] listFiles();
     */
    @Test
    public void testList(){
        File file = new File("D:\\Program Files\\Java\\jdk1.8.0_66");

        //2. 判断是否存在
        if(!file.exists()){
            System.out.println(file+"不存在!");
            return;
        }

        if(file.isDirectory()){
            File[] files = file.listFiles();
            if(null!=files && files.length>0){
                for(File f:files){
                    //文件 - 文件名
                    if(f.isFile()){
                        System.out.println(f.getName());
                    }else if(f.isDirectory()){

                        System.out.println(f.getAbsolutePath());
                    }else{
                        System.out.println("错误文件!");
                    }
                }
            }

        }else{
            System.out.println("sorry,不是一个目录实例!");
        }
    }

    /**
     * 找出某个路径下所有的.txt文件 [第一层]
     * 作业 - 给定一个目录,将该目录下的所有的.txt 的file全部输出
     */
    @Test
    public void testFilenameFilter(){
        //1. 构建出File实例
        File file = new File("src/tech/aistar/day15");

//        File[] files = file.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {//name就是目录或者文件的名
//                File f = new File(dir,name);
//
//                if(f.isDirectory()){
//                    return true;
//                }
//
//                if(name.endsWith(".txt")){
//                    return true;
//                }
//
//                return false;//根据条件进行判断,如果返回true,则放入到File[]中.
//            }
//        });

        File[] files = file.listFiles((dir,name)->{
            File f = new File(dir,name);
                if(f.isDirectory()){
                    return true;//因为目录中的目录的.txt文件也要获取出来
                }
                if(name.endsWith(".txt")){
                    return true;
                }
                return false;
        });

        System.out.println("----------------");
        System.out.println(files.length);

        for(File n:files){
            if(n.isFile()) {
                System.out.println(n);
            }
        }
    }
}
