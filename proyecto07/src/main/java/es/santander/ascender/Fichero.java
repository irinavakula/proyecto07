package es.santander.ascender;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fichero {
    public byte[] leer(String nombreFichero) throws IOException {

        int valor;

        //valor = 1;
        //int a, b, c;
        //int a, b, c = 3;
        
     public byte[] leer(String nombreFichero) throws IOException {
            int valor;
    
    
    
    
    
    
    
    
    public byte[] leer(String nombreFichero) throws IOException {
        int cuantos;
        byte[] valores = new byte[4096];

        FileInputStream fis = new FileInputStream(nombreFichero);
        ByteArrayInputStream boas = new ByteArrayInputStream();
        while ((cuantos = fis.read()) != -1) {
            baos.write(valores, 0, cuantos);
        }

        return baos.toByteArray();      
    }

    public void escribir(String nombreFitchero, byte[] datos) {
        FileOutputStream fos = new FileOutputStream(nombreFitchero);

        fos.write(datos);
    }

    @Override
    public void close() throws IOException {
        //TODO Auto-generated method stub
        throw new Unsupport
    }




}
