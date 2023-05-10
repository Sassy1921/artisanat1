package ma.artisanat;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;


public class readwritetextFileartisan {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/main/resources/inputDataText.txt"));
        ArrayList<artisan> list = new ArrayList<artisan>();
        artisan a = null;
        String readLine = br.readLine();
        while(readLine != null){

            String [] artisan  = readLine.split("\\|");
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date date = formatter.parse(artisan[2].trim());


            a = new artisan();
            a.setId(Integer.parseInt(artisan[0].trim()));
            a.setName(artisan[1].trim());
            a.setDateNaissance(date);
            a.setGender(artisan[3].trim());
            a.setProduct(Integer.parseInt(artisan[4].trim()));
            a.setSpecialty(artisan[5].trim());
            a.setTel(Integer.parseInt(artisan[6].trim()));
            a.setAddress(artisan[7].trim());
            a.setExperience(Integer.parseInt(artisan[8].trim()));


            list.add(a);
            readLine = br.readLine();
        }
        try( FileOutputStream fout = new FileOutputStream("src/main/resources/outputDataText.txt"))
        {

            for(artisan artsn : list){
                fout.write(artsn.toString().getBytes());
                fout.write('\n');

                System.out.println("Artisan :"+artsn.toString());
            }
        }
        catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
