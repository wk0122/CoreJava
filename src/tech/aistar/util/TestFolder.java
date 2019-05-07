package tech.aistar.util;

import java.io.*;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/17 0017
 */
@SuppressWarnings("all")
public class TestFolder {
    public static void main(String[] args) {
       // File file = new File("E:\\Java\\jdk1.8.0_66");
       // listFile(file);
        copy("E:\\Java\\jdk1.8.0_66","E:\\Java\\jdk1.8.0_67");
    }

    public static void listFiles(File file){
//        if(file.isFile()){
//            System.out.println(file.getName());
//            return;
//        }
        File[] files = file.listFiles();
        if(null!=files && files.length>0){
            for (File f:files){
                if(f.isFile()){
                    System.out.println(f.getName());
                }else if(f.isDirectory()){
                    System.out.println(f.getAbsolutePath());
                    listFiles(f);
                }
            }
        }
    }

    public static void listFile(File file){
        //罗列所有文件信息
        //File[] files = file.listFiles();

        //传入指定过滤器
        File[] files = file.listFiles();

        for(File f : files){
            if(f.isDirectory()){
                System.out.println(f.getAbsolutePath());
                //递归调用自己
                listFile(f);
            }else{
                System.out.println("\t" + f.getName());
            }
        }
    }

    public static void copyFolder(String src,String target){
        File srcFile = new File(src);
        File targetFile = new File(target);

        if(srcFile.isDirectory()){
            if(!targetFile.exists()){
                targetFile.mkdirs();
            }
            String[] names = srcFile.list();
            for(String s:names){
                copyFolder(src+"/"+s,target+"/"+s);
            }
        }else if(srcFile.isFile()){
            //构建带缓存的文件字符输入流
            BufferedReader br = null;
            //输出流
            PrintWriter pw = null;

            //初始化
            try {
                br = new BufferedReader(new FileReader(src));
                pw = new PrintWriter(new FileWriter(target),true);
                //定义一个变量,用来保存读取到的内容
                String line = null;
                //循环读取
                while(true){
                    line = br.readLine();
                    if(null==line){
                        break;
                    }
                    pw.println(line);
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public static void copy(String src,String target){

        //构建源文件File实例
        File file = new File(src);
        if(!file.exists()){
            System.out.println("对不起!源文件不存在!");
            return;
        }
        //构建目标文件File实例
        File fileb = new File(target);

        //判断是否为文件,是文件的话,就直接拷贝
        if(file.isFile()){
            //构建带缓存的文件字符输入流
            BufferedReader br = null;
            //输出流
            PrintWriter pw = null;

            //初始化
            try {
                br = new BufferedReader(new FileReader(src));
                pw = new PrintWriter(new FileWriter(target),true);
                //定义一个变量,用来保存读取到的内容
                String line = null;
                //循环读取
                while(true){
                    line = br.readLine();
                    if(null==line){
                        break;
                    }
                    pw.println(line);
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }else if(file.isDirectory()){
            if(!fileb.exists()){
                //创建文件夹
                fileb.mkdirs();
            }

            // 返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
            String[] fileName = file.list();
            for (String s : fileName) {
                //递归调用自己
                copy(src+"/"+s, target+"/"+s);
            }
        }

    }
}
