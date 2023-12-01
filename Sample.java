import java.awt.*;
import java.awt.event.*;
import java.lang.Math;
class Sample extends WindowAdapter implements ActionListener{
	Frame f;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	Button badd,bsub,bmult,bdiv,bfact,bmod,bcalc,bclr,bpts,bneg,bback,bpow,band,bor,bxor,bls,brs,bnot,bprime,bmoddiv,bsqrt;
	Label l1;
	int check,num1,num2,res,i,fact=1,close=0;
	double res1,n1,n2;
	Sample()
	{
		f=new Frame("PyC-Calculator");
		l1=new Label();
		l1.setBackground(Color.orange);
		l1.setFont(new Font("Arial",Font.PLAIN,20));
		f.setBackground(Color.black);
		l1.setBounds(50,50,380,70); 
		
		b1=new Button("1");
  b1.setBounds(50,340,50,50);
  b1.setBackground(Color.GREEN);
  //b1.setBackground(Color.BLUE);
b2=new Button("2");
  b2.setBounds(120,340,50,50);
  b2.setBackground(Color.GREEN);
  //b2.setBackground(Color.orange);
b3=new Button("3");
  b3.setBounds(190,340,50,50);
  b3.setBackground(Color.GREEN);
b4=new Button("4");
  b4.setBounds(50,270,50,50);
  b4.setBackground(Color.GREEN);
  //b4.setBackground(Color.MAGENTA);
b5=new Button("5");
  b5.setBounds(120,270,50,50); 
  //b5.setBackground(Color.PINK);
  b5.setBackground(Color.GREEN);
b6=new Button("6");
  b6.setBounds(190,270,50,50);
  b6.setBackground(Color.GREEN);
b7=new Button("7");
  b7.setBounds(50,200,50,50);
  b7.setBackground(Color.GREEN);
b8=new Button("8");
  b8.setBounds(120,200,50,50);
  b8.setBackground(Color.GREEN);
b9=new Button("9");
  b9.setBounds(190,200,50,50);
  b9.setBackground(Color.GREEN);
b0=new Button("0");
  b0.setBounds(120,410,50,50);
  b0.setBackground(Color.GREEN);
		
bback=new Button("back");
 bback.setBounds(120,130,50,50);
 bback.setBackground(Color.cyan);

badd=new Button("+");
  badd.setBounds(260,340,50,50);
  badd.setBackground(Color.yellow);
bls=new Button("<< (LEFT SHIFT)");
  bls.setBounds(330,340,100,50);
  bls.setBackground(Color.magenta);
bmoddiv=new Button("//");
bmoddiv.setBounds(260,410,50,50);
bmoddiv.setBackground(Color.yellow);
bsqrt=new Button("Sqrt()");
bsqrt.setBounds(190,410,50,50);
bsqrt.setBackground(Color.cyan);
  
bsub=new Button("-");
  bsub.setBounds(260,270,50,50);
  bsub.setBackground(Color.yellow);
bxor=new Button("^ (Bitwise XOR)");
  bxor.setBounds(330,270,100,50);
  bxor.setBackground(Color.magenta);

bmult=new Button("*");
  bmult.setBounds(260,200,50,50);
  bmult.setBackground(Color.yellow);
bor=new Button("|| (Bitwise OR)");
  bor.setBounds(330,200,100,50);
  bor.setBackground(Color.magenta);
bpow=new Button("** (or) ^ (power)");
  bpow.setBounds(148,480,90,50);
  bpow.setBackground(Color.cyan);
  
bdiv=new Button("/");
  bdiv.setBounds(260,130,50,50);
  bdiv.setBackground(Color.yellow);
band=new Button("&&(Bitwise AND)");
  //band.setBounds(320,270,90,50);
  
	band.setBounds(330,130,100,50); 
	band.setBackground(Color.magenta);
bfact=new Button("! (FACTORIAL)");
  bfact.setBounds(50,480,90,50);
  bfact.setBackground(Color.cyan);
bmod=new Button("%");
  bmod.setBounds(190,130,50,50);
  bmod.setBackground(Color.yellow);
bcalc=new Button("=");
  bcalc.setBounds(250,480,65,50);
  bcalc.setBackground(Color.pink);
brs=new Button(">>(RIGHT SHIFT)");
  brs.setBounds(330,410,100,50);
  brs.setBackground(Color.magenta);
bnot=new Button("~ (Bitwise NOT)");
  bnot.setBounds(330,480,100,50);
  bnot.setBackground(Color.magenta);
bclr=new Button("CE"); 
  bclr.setBounds(50,130,65,50);
  //bclr.setBackground(Color.cyan);
  bclr.setBackground(Color.cyan);
bprime=new Button("isprime()");
  bprime.setBounds(50,410,60,50);
  bprime.setBackground(Color.cyan);

b1.addActionListener(this); 
b2.addActionListener(this);  
b3.addActionListener(this);  
b4.addActionListener(this);  
b5.addActionListener(this); 
b6.addActionListener(this); 
b7.addActionListener(this); 
b8.addActionListener(this); 
b9.addActionListener(this);  
b0.addActionListener(this);
bback.addActionListener(this);
bmoddiv.addActionListener(this);
bsqrt.addActionListener(this);
bprime.addActionListener(this);
bnot.addActionListener(this);		
bxor.addActionListener(this);
bls.addActionListener(this);
brs.addActionListener(this);
badd.addActionListener(this);
bor.addActionListener(this);
bsub.addActionListener(this);
band.addActionListener(this);
bmult.addActionListener(this);
bpow.addActionListener(this);
bdiv.addActionListener(this);
bfact.addActionListener(this);
bmod.addActionListener(this);
bcalc.addActionListener(this);
bclr.addActionListener(this); 

f.addWindowListener(this);
//ADDING TO FRAME   
f.add(l1);  
f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5);f.add(b6); f.add(b7); f.add(b8);f.add(b9);f.add(b0);

f.add(badd);f.add(bxor);f.add(bsub);f.add(bls); f.add(bmod); f.add(bmult);f.add(bor);
f.add(bpow);
f.add(bmoddiv);
f.add(bsqrt);
f.add(bprime);
 f.add(bdiv);
 f.add(band);
f.add(bfact);
f.add(bnot);
 f.add(bmod);f.add(bcalc);f.add(brs);
f.add(bclr);f.add(bback);

f.setSize(470,570);  
f.setLayout(null);  
f.setVisible(true);  


	}
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}
	public void actionPerformed(ActionEvent e)
	{
		String z,zt;
                        //NUMBER BUTTON 
if(e.getSource()==b1){
 zt=l1.getText();
 if(zt=="+"||zt=="-"||zt=="*"||zt=="/"||zt=="%"||zt=="&&"||zt=="||"||zt=="^"||zt=="<<"||zt==">>"||zt=="~"||zt=="**"||zt=="prime("||zt=="//"||close==1||zt=="sqrt(")
	 zt="";
  z=zt+"1";
  l1.setText(z);
  close=0;
}
if(e.getSource()==b2){
zt=l1.getText();
if(zt=="+"||zt=="-"||zt=="*"||zt=="/"||zt=="%"||zt=="&&"||zt=="||"||zt=="^"||zt=="<<"||zt==">>"||zt=="~"||zt=="**"||zt=="prime("||close==1||zt=="//"||zt=="sqrt(")
	 zt="";
	
z=zt+"2";
l1.setText(z);
close=0;
}
if(e.getSource()==b3){
zt=l1.getText();
if(zt=="+"||zt=="-"||zt=="*"||zt=="/"||zt=="%"||zt=="&&"||zt=="||"||zt=="^"||zt=="<<"||zt==">>"||zt=="~"||zt=="**"||zt=="prime("||close==1||zt=="//"||zt=="sqrt(")
	 zt="";
  z=zt+"3";
  l1.setText(z);
  close=0;
}
if(e.getSource()==b4){
zt=l1.getText();
if(zt=="+"||zt=="-"||zt=="*"||zt=="/"||zt=="%"||zt=="&&"||zt=="||"||zt=="^"||zt=="<<"||zt==">>"||zt=="~"||zt=="**"||zt=="prime("||close==1||zt=="//"||zt=="sqrt(")
	 zt="";
  z=zt+"4";
  l1.setText(z);
  close=0;
}
if(e.getSource()==b5){
zt=l1.getText();
if(zt=="+"||zt=="-"||zt=="*"||zt=="/"||zt=="%"||zt=="&&"||zt=="||"||zt=="^"||zt=="<<"||zt==">>"||zt=="~"||zt=="**"||zt=="prime("||close==1||zt=="//"||zt=="sqrt(")
	 zt="";
  z=zt+"5";
  l1.setText(z);
  close=0;
}
if(e.getSource()==b6){
zt=l1.getText();
if(zt=="+"||zt=="-"||zt=="*"||zt=="/"||zt=="%"||zt=="&&"||zt=="||"||zt=="^"||zt=="<<"||zt==">>"||zt=="~"||zt=="**"||zt=="prime("||close==1||zt=="//"||zt=="sqrt(")
	 zt="";
 
  z=zt+"6";
  l1.setText(z);
  close=0;
}
if(e.getSource()==b7){
zt=l1.getText();
if(zt=="+"||zt=="-"||zt=="*"||zt=="/"||zt=="%"||zt=="&&"||zt=="||"||zt=="^"||zt=="<<"||zt==">>"||zt=="~"||zt=="**"||zt=="prime("||close==1||zt=="//"||zt=="sqrt(")
	 zt="";
  z=zt+"7";
  l1.setText(z);
  close=0;
}
if(e.getSource()==b8){
zt=l1.getText();
if(zt=="+"||zt=="-"||zt=="*"||zt=="/"||zt=="%"||zt=="&&"||zt=="||"||zt=="^"||zt=="<<"||zt==">>"||zt=="~"||zt=="**"||zt=="prime("||close==1||zt=="//"||zt=="sqrt(")
	 zt="";
  z=zt+"8";
  l1.setText(z);
  close=0;
}
if(e.getSource()==b9){
zt=l1.getText();
if(zt=="+"||zt=="-"||zt=="*"||zt=="/"||zt=="%"||zt=="&&"||zt=="||"||zt=="^"||zt=="<<"||zt==">>"||zt=="~"||zt=="**"||zt=="prime("||close==1||zt=="//"||zt=="sqrt(")
	 zt="";
  z=zt+"9";
  l1.setText(z);
  close=0;
}
if(e.getSource()==b0){
zt=l1.getText();
if(zt=="+"||zt=="-"||zt=="*"||zt=="/"||zt=="%"||zt=="&&"||zt=="||"||zt=="^"||zt=="<<"||zt==">>"||zt=="~"||zt=="**"||zt=="prime("||close==1||zt=="//"||zt=="sqrt(")
	 zt="";
  
  z=zt+"0";
  l1.setText(z);
  close=0;
}
if(e.getSource()==bback){  // FOR  BACKSPACE
  zt=l1.getText();
  try{
    z=zt.substring(0, zt.length()-1);
    }catch(StringIndexOutOfBoundsException f){return;}
  l1.setText(z);
}
                //AIRTHMETIC BUTTON
if(e.getSource()==badd){                     //FOR ADDITION
  try{
    num1=Integer.parseInt(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="+";
  l1.setText(z);
  check=1;
}
if(e.getSource()==bls)
{
	try{
		num1=Integer.parseInt(l1.getText());
	}catch(NumberFormatException f)
	{
		l1.setText("Invalid Format");
		return;
	}
	z="<<";
	l1.setText(z);
	check=11;
}

if(e.getSource()==bor)
{
	try{
		num1=Integer.parseInt(l1.getText());
	}catch(NumberFormatException f){
		l1.setText("Invalid Format");
      return;
    }
	z="||";
  l1.setText(z);
  check=8;
}
if(e.getSource()==bsub){                    //FOR SUBTRACTION
  try{
    num1=Integer.parseInt(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="-";
  l1.setText(z);
  check=2;
}
if(e.getSource()==band)
{
	try{
		num1=Integer.parseInt(l1.getText());
	}catch(NumberFormatException f)
	{
		l1.setText("Invalid Format");
      return;
    }
	z="&&";
  l1.setText(z);
  check=9;
}
if(e.getSource()==bmult){                   //FOR MULTIPLICATION
  try{
    num1=Integer.parseInt(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="*";
  l1.setText(z);
  check=3;
}
if(e.getSource()==bpow)
{
	try{
		num1=Integer.parseInt(l1.getText());
	}catch(NumberFormatException f){
		l1.setText("Invalid Format");
      return;
    }
	z="**";
  l1.setText(z);
  check=7;
}
if(e.getSource()==bdiv){                   //FOR DIVISION
  try{
    n1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="/";
  l1.setText(z);
  check=4;
}
if(e.getSource()==bfact)
{
	try{
    num1=Integer.parseInt(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
	z="!";
  l1.setText(z);
  check=6;
} 	
	
if(e.getSource()==bmod){                  //FOR MOD/REMAINDER
  try{
    num1=Integer.parseInt(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="%";
  l1.setText(z);
  check=5;
}
if(e.getSource()==bxor)
{
	try{
		num1=Integer.parseInt(l1.getText());
	}catch(NumberFormatException f)
	{
		l1.setText("Invalid Format");
		return;
	}
	z="^";
  l1.setText(z);
  check=10;
}
if(e.getSource()==brs)
{
	try{
		num1=Integer.parseInt(l1.getText());
	}catch(NumberFormatException f)
	{
		l1.setText("Invalid Format");
		return;
	}
	z=">>";
	l1.setText(z);
	check=12;
}
if(e.getSource()==bnot)
{
	z="~";
	l1.setText(z);
	check=13;
}
if(e.getSource()==bprime)
{
	z="prime(";
	l1.setText(z);
	check=14;
}
if(e.getSource()==bmoddiv)
{
	try{
		num1=Integer.parseInt(l1.getText());
	}catch(NumberFormatException f)
	{
		l1.setText("Invalid Format");
		return;
	}
	z="//";
	l1.setText(z);
	check=15;
}
if(e.getSource()==bsqrt)
{
	z="sqrt(";
	l1.setText(z);
	check=16;
}
                         //RESULT BUTTON
if(e.getSource()==bcalc){
  if(check==6)
  {
	res=1;
	for(int i=1;i<=num1;i++)
	{
		res=res*i;
	}
	l1.setText(String.valueOf(res));
	close=1;
	return;
  }
  if(check==4)
  {
	  try{
    n2=Double.parseDouble(l1.getText());
    }catch(Exception f){
      l1.setText("ENTER NUMBER FIRST ");
      return;
    }
	res1=n1/n2;
	l1.setText(String.valueOf(res1));
	close=1;
	return;
  }
  if(check==16)
  {
	  try{
		  n2=Double.parseDouble(l1.getText());
	  }catch(Exception f){
      l1.setText("ENTER NUMBER FIRST ");
      return;
	  }
	  res1=Math.sqrt(n2);
	  l1.setText(String.valueOf(res1));
	close=1;
	return;
  }
	  
  
  try{
    num2=Integer.parseInt(l1.getText());
    }catch(Exception f){
      l1.setText("ENTER NUMBER FIRST ");
      return;
    }
  if(check==1)
    res =num1+num2;
  if(check==2)
    res =num1-num2;
  if(check==3)
    res=num1*num2;
   
  if(check==5)
    res =num1%num2;
  if(check==7)
  {
	  res=1;
	  for(int i=0;i<num2;i++)
	  {
		  res=num1*res;
	  }
  }
  if(check==8)
  {
  res=num1|num2;
  }
  if(check==9)
	res=num1&num2;
  if(check==10)
	res=num1^num2;
  if(check==11)
	res=num1<<num2;
  if(check==12)
	res=num1>>num2;
  if(check==13)
	  res=~num2;
  if(check==14)
  {
	  String r="prime";
	  for(int i=2;i<=num2/2;i++)
	  {
		  if(num2%i==0)
		  {
			  r="not prime";
			  break;
		  }
	  }
	  l1.setText(r);
	  return;
  }
  if(check==15)
  {
	  res=num1/num2;
  }
  l1.setText(String.valueOf(res));
  close=1;
}
                        //FOR CLEARING THE LABEL and Memory
if(e.getSource()==bclr){
  num1=0;
  num2=0;
  check=0;
  res=0;
   z="";
   l1.setText(z);
} 
	}
	public static void main(String args[])
	{
		new Sample();
	}
}