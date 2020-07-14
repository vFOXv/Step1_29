package com.company.JavaLesson27.IO.HW;

import java.io.*;

public class IO_HW1 {

    public void printFile(File file) {
        int count = -1;
        try (InputStream in = new FileInputStream(file)) {
            while ((count = in.read()) != -1) {
                System.out.print((char) count);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printFileArray(File file) {
        int count = -1;
        byte bytes[] = new byte[256];
        try (InputStream in = new FileInputStream(file)) {
            while ((count = in.read(bytes)) != -1) {
                //Если указать только bytes, то  в последнем выводе в конце текст повторяеться ---- String string = new String(bytes);   --- > в массиве остаеться данные с прошлого цикла
                // и на последнем цикле масив перезаписываеться частично, и старые данные в конце масива также выводяться
                String string = new String(bytes, 0, count, "utf8");
                System.out.print(string );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printFileBuffer(File file) {
        try (BufferedInputStream buffInput = new BufferedInputStream(new FileInputStream(file),1024)) {
            byte bytes[] = new byte[256];
            int count = -1;
//            buffInput.read(bytes);                                   // при расположениии вне цикла не распечатывает начало и конец текста(если sout в цикле - там он вызываетьс в условии while(buffInput.read(bytes))
//            System.out.print(new String(bytes));
            while((count = buffInput.read(bytes)) !=-1) {
               // buffInput.read(bytes);                          // при расположении внутри цикла не распечатывает большую часть текста --->
               // ---> происходит вторичный вызов метода read(), и он загружает в теле цикла уже вторию порцию данных в массив. Метода read()
                // надо вызывать только в условии while() - один раз.
                System.out.print(new String(bytes, 0,count,"utf8"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
