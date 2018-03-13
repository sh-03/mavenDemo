package util;

import org.apache.poi.xwpf.converter.core.BasicURIResolver;
import org.apache.poi.xwpf.converter.core.FileImageExtractor;
import org.apache.poi.xwpf.converter.xhtml.XHTMLConverter;
import org.apache.poi.xwpf.converter.xhtml.XHTMLOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.*;

public class WordToHtml {
    public void  indexMethod(){
        String path = "G:\\新建文件夹 (3)";
        String file1 = "G:\\新建文件夹 (3)\\test.docx";
        String file2 = "G:\\新建文件夹 (3)\\test2.html";
        File file = new File(file1);
        if(!file.exists()){
            System.out.println("Sorry File does not Exists!");
        }else {
            if(file.getName().endsWith(".docx") || file.getName().endsWith(".DOCX")) {
                //读取文档内容
                try {
                    InputStream in = new FileInputStream(file);
                    XWPFDocument document = new XWPFDocument(in);

                    File imageFolderFile = new File(path);
                    //加载html页面时图片路径
                    XHTMLOptions options = XHTMLOptions.create().URIResolver( new BasicURIResolver("./"));
                    //图片保存文件夹路径
                    options.setExtractor(new FileImageExtractor(imageFolderFile));
                    OutputStream out = new FileOutputStream(new File(file2));
                    XHTMLConverter.getInstance().convert(document, out, options);
                    out.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
