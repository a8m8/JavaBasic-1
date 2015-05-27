package com.sourceit.java.basic.lesson15.streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
			inputStream = new FileReader("xanadu.txt");
			outputStream = new FileWriter("characteroutput.txt");
			
			int c; //character value
			while ((c = inputStream.read()) != -1) {
				System.out.println(c);
			    outputStream.write(c);
			    outputStream.write(65);
			}
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}