package bak.qr.bak.qrcode;

import bak.qr.bak.model.Festa;
import bak.qr.bak.model.Utente;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratoreQr {


    public static byte[] getQRCodeImage(String text, int width, int height) throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

        ByteArrayOutputStream pngOutputStream = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "PNG", pngOutputStream);
        byte[] pngData = pngOutputStream.toByteArray();
        return pngData;
    }


    public static byte[] generaQrDaInformazioni(Utente utente, Festa festa) throws WriterException, IOException {
        String testoqr = utente.getId() + ";" + festa.getId();
        return getQRCodeImage(testoqr , 100 , 100);

    }



}
