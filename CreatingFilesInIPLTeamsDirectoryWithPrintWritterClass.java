import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreatingFilesInIPLTeamsDirectoryWithPrintWritterClass {
    public static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Chennai Super Kings.txt");
        PrintWriter p1=new PrintWriter(f);
        String[] s={"MS Dhoni(Captain) (wk)(B)", "Suresh Raina(B)", "Ravindra Jadeja(SBW)(AR)(B)", "Harbhajan Singh(SBW)(AR)","Dwayne Bravo(FBW)(AR)(FP)(B)", "Shane Watson(FBW)(FP)(AR)(B)", "Ambati Rayudu(B)", "Faf Du Plessis(B)(FP)","Murali Vijay(B)",
                "Kedar Jadhav(SBW)(AR)(B)", "Rituraj Gaikwad(B)", "Karn Sharma(SBW)(AR)", "Imran Tahir(SBW)(FP)", "Mitchell Santner(SBW)(AR)(FP)", "Shardul Thakur(SBW)", "KM Asif(FBW)", "Deepak Chahar(FBW)", "Monu Singh(SBW)", "Lungi Ngidi(FBW)(FP)",
                "N Jagadeesan(B)","Sam Curran(FBW)(FP)" , "Piyush Chawla(SBW)" , "Josh Haz(FBW)(FP)","R Sai Kishore(SBW)"};
        for (int i = 0; i < s.length; i++) {

            p1.println((i+1)+".\t"+s[i]);
        }
        FileWriter f1=new FileWriter("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Delhi DareDevils.txt");
        PrintWriter p2=new PrintWriter(f1);
        String[] s1={"Shreyas Iyer (Captain)(B)", "Shikhar Dhawan(B)", "Prithvi Shaw(B)", "Rishabh Pant(wk)(B)", "Ishant Sharma(FBW)", "Amit Mishra(SBW)", "Keemo Paul(FP)(AR)(FBW)", "Kagiso Rabada(FP)(FBW)", "Sandeep Lamichanne(FP)(SBW)",
                "Harshal Patel(FBW)", "Avesh Khan(FBW)", "Axar Patel(AR)(SBW)", "Shimron Hetmyer(B)(FP)" , "Jason Roy(B)(FP)" , "Alex  Carey(B)(FP)" , "Marcus Stoinis(AR)(FBW)(B)(FP)", "Chris Woakes(B)(FP)" , "Lalit Yadav(B)" , "Tushar Deshpande(FBW)" ,
                "Mohit Sharma(FBW)"};
        for (int i = 0; i < s1.length; i++) {

            p2.println((i+1)+".\t"+s1[i]);
        }
        FileWriter f2=new FileWriter("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/KingsXI Punjab.txt");
        PrintWriter p3=new PrintWriter(f2);
        String[] s2={"KL Rahul (Captain)(B)", "Sarfaraz Khan(B)", "Harpreet Brar(SBW)", "Mohammed Shami(FBW)", "Murugan Ashwin(SBW)", "Mujeeb-ur-Rahman(SBW)(FP)",  "Chris Gayle(B)(FP)", "Mayank Agarwal(B)",
                "Karun Nair(B)", "Mandeep Singh(B)", "Nicholas Pooran (FP)(B)(wk)", "Hardus Viljoen(FBW)(FP)", "Arshdeep Singh(FBW)", "Darshan Nalkande(AR)(FBW)","Glen Maxwell(B)(AR)(SBW)(FP)" , "Sheldon Cottrell(FBW)(FP)" ,
                "Chris Jordan(FBW)(FP)" , "Ravi Bishnoi(SBW)" , "Deepak Hooda(AR)(SBW)(B)" ,  "Jame Neesham(FP)(AR)(FBW)(B)" ,"Prabhsimran Singh(B)" , "Tajinder Dhillon(AR)(B)"};
        for (int i = 0; i < s2.length; i++) {

            p3.println((i+1)+".\t"+s2[i]);
        }
        FileWriter f3=new FileWriter("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Kolkata KnightRiders.txt");
        PrintWriter p4=new PrintWriter(f3);
        String[] s3={"Dinesh Karthik (Captain) (wk)(B)", "Andre Russell(AR)(FBW)(B)(FP)", "Shubhman Gill(B)", "Sunil Narine(SBW)(FP)", "Rinku Singh(B)", "Nitish Rana(B)", "Kamlesh Nagarkoti(FBW)", "Shivam Mavi(FBW)", "Prasidh Krishna(FBW)",
                "Kuldeep Yadav(SBW)", "Harry Gurney(FP)(FBW)", "Lockie Ferguson(FBW)(FP)", "Sandeep Warrier(FBW)", "Pat Cummins(AR)(FBW)(FP)" , "Eoin Morgan(B)", "Varun Chakravarthy(AR)(SBW)", "Tom Banton(FP)(B)" , "Pravin Tambe(SBW)",
                "Nikhil Naik(B)", "Chris Green(FP)(AR)(B)(SBW) "};
        for (int i = 0; i < s3.length; i++) {

            p4.println((i+1)+".\t"+s3[i]);
        }
        FileWriter f4=new FileWriter("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Mumbai Indians.txt");
        PrintWriter p5=new PrintWriter(f4);
        String[] s4={"Rohit Sharma (Captain)(B)", "Jasprit Bumrah(FBW)", "Krunal Pandya(AR)(B)(SBW)", "Hardik Pandya(AR)(B)(FBW)", "Ishan Kishan(B)", "Suryakumar Yadav(B)", "Aditya Tare(B)", "Quinton De Kock(wk)(FP)(B)",
                "Anmolpreet Singh(FBW)", "Kieron Pollard(AR)(FP)(FBW)(B)", "Anukul Roy(AR)(SBW)", "Jayant Yadav(AR)(SBW)", "Lasith Malinga(FBW)(FP)", "Mitchell McClenaghan(FBW)(FP)", "Rahul Chahar(SBW)","Nathan Coulter Nile(AR)(FBW)(FP)" ,
                "Chris Lynn(B)(FP)" , "Saurabh Tiwary(B)", "Mohsin Khan(FBW)", "Digvijay Deshmukh(FBW)",  "Balwant Rai Singh. (B)"};
        for (int i = 0; i < s4.length; i++) {

            p5.println((i+1)+".\t"+s4[i]);
        }
        FileWriter f5=new FileWriter("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Rajasthan Royals.txt");
        PrintWriter p6=new PrintWriter(f5);
        String[] s5={"Steve Smith (Captain)(B)(FP)", "Jos Buttler(wk)(B)(FP)", "Ben Stokes(B)(AR)(FBW)(FP)", "Sanju Samson(B)", "Manan Vohra(B)", "Jofra Archer(AR)(FBW)(FP)", "Ankit Rajpoot(FBW)", "Riyan Parag(AR)(B)(SBW)", "Mahipal Lomror(B)",
                "Shashank Singh(B)", "Shreyas Gopal(AR)(SBW)", "Rahul Tewatia(AR)(SBW)", "Mayank Markande(SBW)", "Varun Aaron(FBW)", "Jaydev Unadkat(FBW)", "Robin Uthappa(B)" , "Yashasvi Jaiswal(B)" ," Anuj Rawat(B)" ,
                "Andre Tye(AR)(FBW)" , "Kartik Tyagi(FBW)" , "David Miller(B)(FP)" , "Tom Curran(FP)(FBW)" , "Oshane Thomas(FP)(FBW)" , "Anirudha Joshi(AR)(SBW)", "Akash Singh(FBW) "};
        for (int i = 0; i < s5.length; i++) {

            p6.println((i+1)+".\t"+s5[i]);
        }
        FileWriter f6=new FileWriter("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Royal Challenger Banglore.txt");
        PrintWriter p7=new PrintWriter(f6);
        String[] s6={"Virat Kohli (Captain)(B)", "AB de Villiers(FP)(B)", "Washington Sundar(AR)(SBW)", "Pawan Negi(AR)(SBW)(B)", "Umesh Yadav(FBW)", "Navdeep Saini(FBW)", "Devdutt Padikkal(B)(AR)(SBW)", "Parthiv Patel (wk)(B)",
                "Gurkeerat Singh Mann(AR)(B)(SBW)", "Moeen Ali(AR)(SBW)(FP)(B)", "Shivam Dube(AR)(FBW)(B)", "Yuzvendra Chahal(SBW)", " Mohammed Siraj(FBW)","Chris Morris(AR)(FBW)(FP)" , "Aaron Finch(B)(FP)" , "Kane Richardson(FBW)(FP)", "Dale Steyn(FBW)(FP)" ,
                "Isuru Udana(FBW)(FP)" , "Shahbaz Ahmad(B)(AR)(SBW)", "Pavan Deshpande(AR)(SBW)", "Joshua Phillipe(FP)(AR)(FBW) "};
        for (int i = 0; i < s6.length; i++) {

            p7.println((i+1)+".\t"+s6[i]);
        }
        FileWriter f7=new FileWriter("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Sunriser Hydrabad.txt");
        PrintWriter p8=new PrintWriter(f7);
        String[] s7={"Kane Williamson (Captain)(B)(FP)", "Khaleel Ahmed(FBW)", "Sandeep Sharma(FBW)", "Siddarth Kaul(FBW)", "Billy Stanlake(FP)(FBW)", "David Warner(B)(FP)", "Manish Pandey(B)", "Jonny Bairstow(FP)(B)",
                "Wriddhiman Saha(wk)(B)", "Shreevats Goswami(B)", "Bhuvneshwar Kumar(FBW)",  "T Natarajan(FBW)", "Abhishek Sharma(B)(AR)(SBW)", "Shahbaz Nadeem(SBW)", "Vijay Shankar(AR)(B)(FBW)", "Mohammad Nabi(FP)(AR)(B)(SBW)",
                "Rashid Khan(FP)(SBW)(AR)", "Basil Thampi(FBW)","Mitchell Marsh(AR)(FP)(B)(FBW)" , "Priyam Garg(B)" , "Virat Singh(B)(AR)(SBW)" , "Fabian Allan(AR)(FP)(SBW)", "Sandeep Bavanka(B)(AR)(SBW)", "Sanjay Yadav(AR)(SBW)" , "Abdul Samad(B)(AR)(SBW)"};
        for (int i = 0; i < s7.length; i++) {

            p8.println((i+1)+".\t"+s7[i]);
        }
        p8.flush();
        p8.close();
        p7.flush();
        p7.close();
        p6.flush();
        p6.close();
        p5.flush();
        p5.close();
        p4.flush();
        p4.close();
        p3.flush();
        p3.close();
        p2.flush();
        p2.close();
        p1.flush();
        p1.close();

    }
}
