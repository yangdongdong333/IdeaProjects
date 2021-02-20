package com.ydd.QRCode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.ydd.QRCode.QRCodeUtils.decode;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/30 9:47
 * @Description:
 */
public class QRCode
{

    /**
     * @param content:二维码代表的内容
     * @param path 二维码在本电脑硬盘上的存放的路径
     * 纯二维码
     */
    public static String code(String content,String path) {
        try {
            String codeName = UUID.randomUUID().toString();// 二维码的图片名
            String imageType = "jpg";// 图片类型
            MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
            Map<EncodeHintType, String> hints = new HashMap<EncodeHintType, String>();
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            BitMatrix bitMatrix = multiFormatWriter.encode(content, BarcodeFormat.QR_CODE, 200, 200, hints);
            File file1 = new File(path, codeName + "." + imageType);
            MatrixToImageWriter.writeToFile(bitMatrix, imageType, file1);
            return codeName+".jpg";
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) throws Exception
    {
//        String result= decode("D:/c07c47b1-2e6a-4bcd-a44c-029964d290fe.jpg" );
//        System.out.println(result);
        System.out.println("a"+"\n"+"b");
    }

}
