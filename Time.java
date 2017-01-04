import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Date;


class MyCanvas1 extends Canvas
{
int flag=0;
int i=0,j=1,k=1,q=1,po=1,ph=12;
int x=90;
int o1=110;
int alm=0,alh=0;
boolean ab=false,ab1=false;
int y=6,z=6,z1=6;

public void paint(Graphics g)
{
int o2,o3,ov=0;
g.setColor(Color.blue);
g.drawString("12",156,88);
g.drawString("3",274,204);
g.drawString("6",158,316);
g.drawString("9",46,202);
g.setColor(Color.darkGray);
//g.drawLine(110,200,110,140);
g.drawOval(34,68,256,257);
g.drawString("CHETAN",145,135);
g.drawString("WATCH",140,280);
g.drawOval(40,75,243,243);
g.setColor(Color.blue);
g.fillOval(157,68,10,8);
//g.fillOval(171,69,4,4);
//g.fillOval(184,71,4,4);
//g.fillOval(196,74,4,4);
g.fillOval(222,86,10,8);
g.fillOval(267,134,10,8);
g.fillOval(282,195,10,8);
g.fillOval(264,258,10,8);
g.fillOval(218,302,10,8);
g.fillOval(157,318,10,8);
g.fillOval(155,196,10,8);
g.fillOval(95,301,10,8);
g.fillOval(52,258,10,8);
g.fillOval(33,195,10,8);
g.fillOval(48,135,10,8);
g.fillOval(93,86,10,8);

if(i==1){
g.drawLine(160,200,160+11,90+110-109);

}

if(i==2){
g.drawLine(160,200,160+22,90+110-107);

}

if(i==3){
g.drawLine(160,200,160+34,90+110-104);

}

if(i==4){
g.drawLine(160,200,160+44,90+110-100);

}
if(i==5){
g.drawLine(160,200,160+55,90+110-95);

}
if(i==6){
g.drawLine(160,200,160+64,90+110-88);

}
if(i==7){
g.drawLine(160,200,160+73,90+110-81);

}

if(i==8){
g.drawLine(160,200,160+81,90+110-73);

}
if(i==9){
g.drawLine(160,200,160+89,90+110-64);

}
if(i==10){
g.drawLine(160,200,160+95,90+110-54);

}
if(i==11){
g.drawLine(160,200,160+100,90+110-44);

}
if(i==12){
g.drawLine(160,200,160+104,90+110-33);

}
if(i==13){
g.drawLine(160,200,160+107,90+110-22);

}
if(i==14){
g.drawLine(160,200,160+109,90+110-11);

}
if(i==15){
g.drawLine(160,200,160+110,90+110-0);

}
if(i==16){
g.drawLine(160,200,160+110-(110-109),90+110+11);

}
if(i==17){
g.drawLine(160,200,160+110-(110-107),90+110+22);

}
if(i==18){
g.drawLine(160,200,160+110-(110-104),90+110+33);

}
if(i==19){
g.drawLine(160,200,160+110-(110-100),90+110+44);

}
if(i==20){
g.drawLine(160,200,160+110-(110-95),90+110+54);

}
if(i==21){
g.drawLine(160,200,160+110-(110-89),90+110+64);

}
if(i==22){
g.drawLine(160,200,160+110-(110-81),90+110+73);

}
if(i==23){
g.drawLine(160,200,160+110-(110-73),90+110+81);

}
if(i==24){
g.drawLine(160,200,160+110-(110-64),90+110+88);

}
if(i==25){
g.drawLine(160,200,160+110-(110-55),90+110+95);

}
if(i==26){
g.drawLine(160,200,160+110-(110-44),90+110+100);

}
if(i==27){
g.drawLine(160,200,160+110-(110-34),90+110+104);

}
if(i==28){
g.drawLine(160,200,160+110-(110-22),90+110+107);

}
if(i==29){
g.drawLine(160,200,160+110-(110-11),90+110+109);

}
if(i==30){
g.drawLine(160,200,160,90+220);

}
if(i==31){
g.drawLine(160,200,160-11,90+220-(110-109));

}
if(i==32){
g.drawLine(160,200,160-22,90+220-(110-107));

}
if(i==33){
g.drawLine(160,200,160-33,90+220-(110-104));

}
if(i==34){
g.drawLine(160,200,160-44,90+220-(110-100));

}
if(i==35){
g.drawLine(160,200,160-54,90+220-(110-95));

}
if(i==36){
g.drawLine(160,200,160-64,90+220-(110-89));

}
if(i==37){
g.drawLine(160,200,160-73,90+220-(110-81));

}
if(i==38){
g.drawLine(160,200,160-81,90+220-(110-73));

}

if(i==39){
g.drawLine(160,200,160-88,90+220-(110-64));

}
if(i==40){
g.drawLine(160,200,160-95,90+220-(110-55));

}
if(i==41){
g.drawLine(160,200,160-100,90+220-(110-44));

}
if(i==42){
g.drawLine(160,200,160-104,90+220-(110-34));

}
if(i==43){
g.drawLine(160,200,160-107,90+220-(110-22));

}
if(i==44){
g.drawLine(160,200,160-109,90+220-(110-11));

}
if(i==45){
g.drawLine(160,200,50,90+110);

}
if(i==46){
g.drawLine(160,200,160-109,90+110-11);

}
if(i==47){
g.drawLine(160,200,160-107,90+110-22);

}
if(i==48){
g.drawLine(160,200,160-104,90+110-33);

}
if(i==49){
g.drawLine(160,200,160-100,90+110-44);

}
if(i==50){
g.drawLine(160,200,160-95,90+110-54);

}
if(i==51){
g.drawLine(160,200,160-89,90+110-64);

}
if(i==52){
g.drawLine(160,200,160-81,90+110-73);

}
if(i==53){
g.drawLine(160,200,160-73,90+110-81);

}
if(i==54){
g.drawLine(160,200,160-64,90+110-88);

}
if(i==55){
g.drawLine(160,200,160-55,90+110-95);

}
if(i==56){
g.drawLine(160,200,160-44,90+110-100);

}
if(i==57){
g.drawLine(160,200,160-33,90+110-104);

}
if(i==58){
g.drawLine(160,200,160-22,90+110-107);

}
if(i==59){
g.drawLine(160,200,160-11,90+110-109);

}
if(i==60){
g.drawLine(160,200,160,90);

}


if(j==1){
g.drawLine(160,200,160+11,90+110-109);

}

if(j==2){
g.drawLine(160,200,160+22,90+110-107);

}

if(j==3){
g.drawLine(160,200,160+34,90+110-104);

}

if(j==4){
g.drawLine(160,200,160+44,90+110-100);

}
if(j==5){
g.drawLine(160,200,160+55,90+110-95);

}
if(j==6){
g.drawLine(160,200,160+64,90+110-88);

}
if(j==7){
g.drawLine(160,200,160+73,90+110-81);

}

if(j==8){
g.drawLine(160,200,160+81,90+110-73);

}
if(j==9){
g.drawLine(160,200,160+89,90+110-64);

}
if(j==10){
g.drawLine(160,200,160+95,90+110-54);

}
if(j==11){
g.drawLine(160,200,160+100,90+110-44);

}
if(j==12){
g.drawLine(160,200,160+104,90+110-33);

}
if(j==13){
g.drawLine(160,200,160+107,90+110-22);

}
if(j==14){
g.drawLine(160,200,160+109,90+110-11);

}
if(j==15){
g.drawLine(160,200,160+110,90+110-0);

}
if(j==16){
g.drawLine(160,200,160+110-(110-109),90+110+11);

}
if(j==17){
g.drawLine(160,200,160+110-(110-107),90+110+22);

}
if(j==18){
g.drawLine(160,200,160+110-(110-104),90+110+33);

}
if(j==19){
g.drawLine(160,200,160+110-(110-100),90+110+44);

}
if(j==20){
g.drawLine(160,200,160+110-(110-95),90+110+54);

}
if(j==21){
g.drawLine(160,200,160+110-(110-89),90+110+64);

}
if(j==22){
g.drawLine(160,200,160+110-(110-81),90+110+73);

}
if(j==23){
g.drawLine(160,200,160+110-(110-73),90+110+81);

}
if(j==24){
g.drawLine(160,200,160+110-(110-64),90+110+88);

}
if(j==25){
g.drawLine(160,200,160+110-(110-55),90+110+95);

}
if(j==26){
g.drawLine(160,200,160+110-(110-44),90+110+100);

}
if(j==27){
g.drawLine(160,200,160+110-(110-34),90+110+104);

}
if(j==28){
g.drawLine(160,200,160+110-(110-22),90+110+107);

}
if(j==29){
g.drawLine(160,200,160+110-(110-11),90+110+109);

}
if(j==30){
g.drawLine(160,200,160,90+220);

}
if(j==31){
g.drawLine(160,200,160-11,90+220-(110-109));

}
if(j==32){
g.drawLine(160,200,160-22,90+220-(110-107));

}
if(j==33){
g.drawLine(160,200,160-33,90+220-(110-104));

}
if(j==34){
g.drawLine(160,200,160-44,90+220-(110-100));

}
if(j==35){
g.drawLine(160,200,160-54,90+220-(110-95));

}
if(j==36){
g.drawLine(160,200,160-64,90+220-(110-89));

}
if(j==37){
g.drawLine(160,200,160-73,90+220-(110-81));

}
if(j==38){
g.drawLine(160,200,160-81,90+220-(110-73));

}

if(j==39){
g.drawLine(160,200,160-88,90+220-(110-64));

}
if(j==40){
g.drawLine(160,200,160-95,90+220-(110-55));

}
if(j==41){
g.drawLine(160,200,160-100,90+220-(110-44));

}
if(j==42){
g.drawLine(160,200,160-104,90+220-(110-34));

}
if(j==43){
g.drawLine(160,200,160-107,90+220-(110-22));

}
if(j==44){
g.drawLine(160,200,160-109,90+220-(110-11));

}
if(j==45){
g.drawLine(160,200,50,90+110);

}
if(j==46){
g.drawLine(160,200,160-109,90+110-11);

}
if(j==47){
g.drawLine(160,200,160-107,90+110-22);

}
if(j==48){
g.drawLine(160,200,160-104,90+110-33);

}
if(j==49){
g.drawLine(160,200,160-100,90+110-44);

}
if(j==50){
g.drawLine(160,200,160-95,90+110-54);

}
if(j==51){
g.drawLine(160,200,160-89,90+110-64);

}
if(j==52){
g.drawLine(160,200,160-81,90+110-73);

}
if(j==53){
g.drawLine(160,200,160-73,90+110-81);

}
if(j==54){
g.drawLine(160,200,160-64,90+110-88);

}
if(j==55){
g.drawLine(160,200,160-55,90+110-95);

}
if(j==56){
g.drawLine(160,200,160-44,90+110-100);

}
if(j==57){
g.drawLine(160,200,160-33,90+110-104);

}
if(j==58){
g.drawLine(160,200,160-22,90+110-107);

}
if(j==59){
g.drawLine(160,200,160-11,90+110-109);

}
if(j==60){
g.drawLine(160,200,160,90);

}




if(po==12){
g.drawLine(160,200,160+6,140+60-59);

}

if(po==24){
g.drawLine(160,200,160+12,140+60-58);

}

if(po==36){
g.drawLine(160,200,160+18,140+60-57);

}

if(po==48){
g.drawLine(160,200,160+24,140+60-54);

}
if(po==60){
g.drawLine(160,200,160+30,140+60-51);

}
if(po==72){
g.drawLine(160,200,160+35,140+60-48);

}
if(po==84){
g.drawLine(160,200,160+40,140+60-44);

}

if(po==96){
g.drawLine(160,200,160+44,140+60-40);

}
if(po==108){
g.drawLine(160,200,160+48,140+60-35);

}
if(po==120){
g.drawLine(160,200,160+51,140+60-29);

}
if(po==132){
g.drawLine(160,200,160+54,140+60-24);

}
if(po==144){
g.drawLine(160,200,160+57,140+60-18);

}
if(po==156){
g.drawLine(160,200,160+58,140+60-12);

}
if(po==168){
g.drawLine(160,200,160+59,140+60-6);

}
if(po==180){
g.drawLine(160,200,160+60,140+60);

}
if(po==192){
g.drawLine(160,200,160+60-(60-59),140+60+6);

}
if(po==204){
g.drawLine(160,200,160+60-(60-58),140+60+12);

}
if(po==216){
g.drawLine(160,200,160+60-(60-57),140+60+18);

}
if(po==228){
g.drawLine(160,200,160+60-(60-54),140+60+24);

}
if(po==240){
g.drawLine(160,200,160+60-(60-51),140+60+29);

}
if(po==252){
g.drawLine(160,200,160+60-(60-48),140+60+35);

}
if(po==264){
g.drawLine(160,200,160+60-(60-44),140+60+40);

}
if(po==276){
g.drawLine(160,200,160+60-(60-40),140+60+44);

}
if(po==288){
g.drawLine(160,200,160+60-(60-35),140+60+48);

}
if(po==300){
g.drawLine(160,200,160+60-(60-30),140+60+51);

}
if(po==312){
g.drawLine(160,200,160+60-(60-24),140+60+54);

}
if(po==324){
g.drawLine(160,200,160+60-(60-18),140+60+57);

}
if(po==336){
g.drawLine(160,200,160+60-(60-12),140+60+58);

}
if(po==348){
g.drawLine(160,200,160+60-(60-6),140+60+59);

}
if(po==360){
g.drawLine(160,200,160,140+120);

}
if(po==372){
g.drawLine(160,200,160-6,140+120-(60-59));

}
if(po==384){
g.drawLine(160,200,160-12,140+120-(60-58));

}
if(po==396){
g.drawLine(160,200,160-18,140+120-(60-57));

}
if(po==408){
g.drawLine(160,200,160-24,140+120-(60-54));

}
if(po==420){
g.drawLine(160,200,160-29,140+120-(60-51));

}
if(po==432){
g.drawLine(160,200,160-35,140+120-(60-48));

}
if(po==444){
g.drawLine(160,200,160-40,140+120-(60-44));

}
if(po==456){
g.drawLine(160,200,160-44,140+120-(60-40));

}

if(po==468){
g.drawLine(160,200,160-48,140+120-(60-35));

}
if(po==480){
g.drawLine(160,200,160-51,140+120-(60-30));

}
if(po==492){
g.drawLine(160,200,160-54,140+120-(60-24));

}
if(po==504){
g.drawLine(160,200,160-57,140+120-(60-18));

}
if(po==516){
g.drawLine(160,200,160-58,140+120-(60-12));

}
if(po==528){
g.drawLine(160,200,160-59,140+120-(60-6));

}
if(po==540){
g.drawLine(160,200,100,140+60);

}
if(po==552){
g.drawLine(160,200,160-59,140+60-6);

}
if(po==564){
g.drawLine(160,200,160-58,140+60-12);

}
if(po==576){
g.drawLine(160,200,160-57,140+60-18);

}
if(po==588){
g.drawLine(160,200,160-54,140+60-24);

}
if(po==600){
g.drawLine(160,200,160-51,140+60-29);

}
if(po==612){
g.drawLine(160,200,160-48,140+60-35);

}
if(po==624){
g.drawLine(160,200,160-44,140+60-40);

}
if(po==636){
g.drawLine(160,200,160-40,140+60-44);

}
if(po==648){
g.drawLine(160,200,160-35,140+60-48);

}
if(po==660){
g.drawLine(160,200,160-30,140+60-51);

}
if(po==672){
g.drawLine(160,200,160-24,140+60-54);

}
if(po==684){
g.drawLine(160,200,160-18,140+60-57);

}
if(po==696){
g.drawLine(160,200,160-12,140+60-58);

}
if(po==708){
g.drawLine(160,200,160-6,140+60-59);

}

if(po==720){
g.drawLine(160,200,160,140);

}






/*if(i==60){
g.drawLine(110,200,110-11,90+110-109);

}*/


} 

}

class Alarm extends Thread{
int q,po,lo;
boolean ab,ab1;
MyCanvas1 mm=new MyCanvas1();

Alarm(boolean ab,boolean ab1){
this.ab=ab;
this.ab1=ab1;

}



public void run(){
//System.out.println("lll"+ab+mm.po);
if(ab==true){
System.out.println("alala");
while(ab1==true&&lo<120){
System.out.println("alala");
Toolkit.getDefaultToolkit().beep();
try{
Thread.sleep(500);
lo++;
}
catch(Exception e){}

}

}

}



}



class RealTime extends Thread implements ActionListener{
JFrame jf,jf1,jf2;

JButton jb,jb1,ja,ja1,jstop;
JTextArea th,tmin,tsec;
JTextArea ah,amin;
Alarm a;
//Alarm a =new Alarm();
boolean b=true,ab=false,ab1=false;
static int gf=0;
int o=1,alm=0,alh=0,pop=0;
MyCanvas1 m=new MyCanvas1();

RealTime(){
//this.a=a;
//Graphics g=jf.getGraphics();

}
/*
void alarm(){
int lo=0;

if(ab==true){
System.out.println("alala");
while(ab1==true&&lo<60){
System.out.println("alala");
Toolkit.getDefaultToolkit().beep();
try{
Thread.sleep(1000);
lo++;
}
catch(Exception e){}
}
}


}
*/
public void actionPerformed(ActionEvent e){
if(e.getSource()==jstop){
a.ab1=false;
}
if(e.getSource()==ja1){
jf2.setVisible(true);
System.out.println(pop);
System.out.println(m.alm);
System.out.println(m.alh);
}
if(e.getSource()==ja){

m.ab=true;

m.ab1=true;
//System.out.println(a.ab);
String s1=ah.getText();
String s2=amin.getText();

m.alh=Integer.parseInt(s1);
m.alm=Integer.parseInt(s2);
int x=0;
x=m.alm/12;
m.alh=(m.alh*5)*12+(x*12);
if(m.alh==732)
m.alh=12;
if(m.alm==0)
m.alm=60;
System.out.println(m.alm);
System.out.println(m.alh);

}

if(e.getSource()==jb){
jf.setVisible(true);

jf1.setVisible(true);

System.out.println(ab);

}
if(e.getSource()==jb1){


String s1=th.getText();
String s2=tmin.getText();
String s3=tsec.getText();
int po1=Integer.parseInt(s1);
m.j=Integer.parseInt(s2);
m.i=Integer.parseInt(s3);

if(m.j==0){
m.j=60;
}

if(po1==12){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
//m.q=x;
if(x==0||x==5)
m.po=12*(60);
if(x>=1&&x<5)
m.po=12*(x);
}

if(po1==0){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
//m.q=x;
if(x==0||x==5)
m.po=12*(60);
if(x>=1&&x<5)
m.po=12*(x);
}





if(po1==1||po1==13){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(5);
if(x<5)
m.po=12*(x+5);
}
if(po1==2||po1==14){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(10);
if(x<5)
m.po=12*(x+10);
}
if(po1==3||po1==15){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(15);
if(x<5)
m.po=12*(x+15);

}
if(po1==4||po1==16){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(20);
if(x<5)
m.po=12*(x+20);

}
if(po1==5||po1==17){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(25);
if(x<5)
m.po=12*(x+25);

}
if(po1==6||po1==18){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(30);
if(x<5)
m.po=12*(x+30);

}
if(po1==7||po1==19){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(35);
if(x<5)
m.po=12*(x+35);

}
if(po1==8||po1==20){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(40);
if(x<5)
m.po=12*(x+40);
}
if(po1==9||po1==21){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(45);
if(x<5)
m.po=12*(x+45);

}
if(po1==10||po1==22){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(50);
if(x<5)
m.po=12*(x+50);

}
if(po1==11||po1==23){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(55);
if(x<5)
m.po=12*(x+55);

}



jf1.setVisible(false);
jf.setVisible(true);

}

}











void set(){
Date d=new Date();
int z=0;
//System.out.println("cuurent hour"+d.getHours());
System.out.println("current minutes"+d.getMinutes());
System.out.println("curent seconds"+d.getSeconds());
m.i=d.getSeconds();
m.j=d.getMinutes();
int po1=d.getHours();
m.ph=po1;
if(m.j==0){
m.j=60;
}

if(po1==12){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
//m.q=x;
if(x==0||x==5)
m.po=12*(60);
if(x>=1&&x<5)
m.po=12*(x);
}

if(po1==0){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
//m.q=x;
if(x==0||x==5)
m.po=12*(60);
if(x>=1&&x<5)
m.po=12*(x);
}





if(po1==1||po1==13){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(5);
if(x<5)
m.po=12*(x+5);
}
if(po1==2||po1==14){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(10);
if(x<5)
m.po=12*(x+10);
}
if(po1==3||po1==15){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(15);
if(x<5)
m.po=12*(x+15);

}
if(po1==4||po1==16){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(20);
if(x<5)
m.po=12*(x+20);

}
if(po1==5||po1==17){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(25);
if(x<5)
m.po=12*(x+25);

}
if(po1==6||po1==18){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(30);
if(x<5)
m.po=12*(x+30);

}
if(po1==7||po1==19){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(35);
if(x<5)
m.po=12*(x+35);

}
if(po1==8||po1==20){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(40);
if(x<5)
m.po=12*(x+40);
}
if(po1==9||po1==21){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(45);
if(x<5)
m.po=12*(x+45);

}
if(po1==10||po1==22){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(50);
if(x<5)
m.po=12*(x+50);

}
if(po1==11||po1==23){
int n=m.j/12;
int x=0;
x=n;
n=n*12;
m.q=m.j-n;
if(x==5)
m.po=12*(55);
if(x<5)
m.po=12*(x+55);

}



}





public void run(){
jf1=new JFrame();
jf2=new JFrame();
ja=new JButton("REFRESH");
ja.setBounds(150,100,100,40);
jf2.add(ja);
amin=new JTextArea("minute");
ah=new JTextArea("hour");
ah.setBounds(50,30,80,40);
amin.setBounds(50,90,80,40);
jf2.add(ah);
jf2.add(amin);
jf2.setLocation(150, 100);
jf2.setLayout(null);
jf2.setSize(370,400);
jb1=new JButton("REFRESH");
jb1.setBounds(150,100,100,40);
jf1.add(jb1);
th=new JTextArea("sET HoUr");
tmin=new JTextArea("sET Min");
tsec=new JTextArea("sET SecOnDS");
th.setBounds(50,30,80,40);
tmin.setBounds(50,90,80,40);
tsec.setBounds(50,150,80,40);
WindowUtilities.setNativeLookAndFeel();
jf1.add(th);
jf1.add(tmin);
jf1.add(tsec);
jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf1.setLocation(150, 100);
jf1.setLayout(null);
jf1.setSize(370,400);

jf=new JFrame();
ja1=new JButton("SeT AlaRm");
ja1.setBounds(170,20,110,35);
ja1.addActionListener(this);
jstop=new JButton("StOp AlaRm");
jstop.setBounds(110,335,120,35);
jstop.addActionListener(this);
jb=new JButton("SeT TiMe");
jb.setBounds(40,20,110,35);
jb.addActionListener(this);
jb1.addActionListener(this);
ja.addActionListener(this);
jf.add(jb);
jf.add(ja1);
jf.add(jstop);
jf.add(m);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setResizable(false);
jf.setLocation(150, 100);
jf.setSize(340,400);
jf.setBackground(Color.black);
jf.setVisible(true);
jf.pack();
//m.repaint();
while(b){
m.i++;
m.repaint();

try{
Thread.sleep(1000);
}
catch(Exception e){}

if(m.i==60){
m.q++;
System.out.println(m.q+"   lll");
if(m.q==12){
m.po=m.po+12;

m.q=0;
}
}
if(m.i==60){
b=true;
m.repaint();
m.j++;
m.i=0;
if(m.alh==m.po&&m.alm==m.j){
System.out.println("aa");
a =new Alarm(m.ab,m.ab1);
a.start();

}

}

if(m.po==732){
m.po=12;

}

if(m.j==60){
m.j=1;

}

}
}
}




class Time {





Time(){

//Graphics g=jf.getGraphics();
//g.drawOval(100,100,60,60);
//g.drawString("======",60,60);


}
public static void main(String...s){
//Alarm a =new Alarm();
//a.start();
RealTime t=new RealTime();
t.set();
t.start();
new Time();
}
}