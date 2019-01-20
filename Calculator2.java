import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator2 {
	//Setting Up Window
	static JFrame window = new JFrame();
	//Setting Up Buttons
	static JButton one = new JButton();
	static JButton two = new JButton();
	static JButton three = new JButton();
	static JButton four = new JButton();
	static JButton five = new JButton();
	static JButton six = new JButton();
	static JButton seven = new JButton();
	static JButton eight = new JButton();
	static JButton nine = new JButton();
	//Setting Up Text Output
	static JLabel output = new JLabel();
	static String numOne;
	static String numTwo;
	static String firstNumString;
	static String secondNumString;
	static JLabel totalString = new JLabel();
	//Setting up number outputs
	static double firstNum;
	static double secondNum;
	static double total;
	//Setting up Operation Buttons
	static JButton addingIt = new JButton();
	static JButton subIt = new JButton();
	static JButton timesIt = new JButton();
	static JButton divIt = new JButton();
	static JButton equalIt = new JButton();
	//Adding Operation Booleans
	   static boolean add;
	   static boolean sub;
	   static boolean times;
	   static boolean div;
	   static boolean equal;
	//Setting Transition Boolean
	   static boolean trans = false;
	
	public static void main(String[] args) {
		
		firstNumString = "";
		secondNumString = "";
		//JFrame Settings
		window.setSize(800, 800);
		window.setLayout(null);
		window.setTitle("Omars Calculator");
		//Output Settings
		output.setBounds(0, 0, 1000, 100);
		output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
		totalString.setText("Total: " + total);
		totalString.setBounds(300, 0, 100, 100);
		//Number Buttons Settings
		one.setBounds(100, 100, 50, 50);
	    one.setText("1");
		one.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent one) {
				oneing();
				
			}
			
		});
	    
	    two.setBounds(200, 100, 50, 50);
	    two.setText("2");
	    two.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent one) {
				twoing();
				
			}
			
		});
	    
	    three.setBounds(300, 100, 50, 50);
	    three.setText("3");
	    three.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent one) {
				threeing();
				
			}
			
		});
	    
	    four.setBounds(100, 200, 50, 50);
	    four.setText("4");
	    four.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent one) {
				fouring();
				
			}
			
		});
	    
	    five.setBounds(200, 200, 50, 50);
	    five.setText("5");
	    five.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent one) {
				fiveing();
				
			}
			
		});
	    
	    six.setBounds(300, 200, 50, 50);
	    six.setText("6");
	    six.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent one) {
				sixing();
				
			}
			
		});
	    
	    seven.setBounds(100, 300, 50, 50);
	    seven.setText("7");
	    seven.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent one) {
				sevening();
				
			}
			
		});
	    
	    eight.setBounds(200, 300, 50, 50);
	    eight.setText("8");
	    eight.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent one) {
				eighting();
				
			}
			
		});
	    
	    nine.setBounds(300, 300, 50, 50);
	    nine.setText("9");
		nine.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent one) {
				nineing();
				
			}
			
		});
	    //Number Buttons Settings
	    addingIt.setBounds(400, 100, 50, 50);
	    addingIt.setText("+");
		addingIt.setBackground(Color.gray);
	    addingIt.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent addingIt) {
			add = true;
			sub = false;
			times = false;
			div = false;
			
			trans = true;
		}
		});
		
	    subIt.setBounds(400, 200, 50, 50);
	    subIt.setText("-");
	    subIt.setBackground(Color.gray);
	    subIt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent addingIt) {
			add = false;
			sub = true;
			times = false;
			div = false;
			
			trans = true;
		}
		});
	    
	    timesIt.setBounds(400, 300, 50, 50);
	    timesIt.setText("X");
	    timesIt.setBackground(Color.gray);
	    timesIt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent addingIt) {
			add = false;
			sub = false;
			times = true;
			div = false;
		
			trans = true;
			}
			});
	    
	    divIt.setBounds(400, 400, 50, 50);
	    divIt.setText("÷");
	    divIt.setBackground(Color.gray);
	    divIt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent addIt) {
			add = false;
			sub = false;
			times = false;
			div = true;
			
			trans = true;
		}
		});
		
	    equalIt.setBounds(400, 500, 50, 50);
	    equalIt.setText("=");
	    equalIt.setBackground(Color.gray);
	    equalIt.addActionListener(new ActionListener() {
	    	
	    	@Override
	    	public void actionPerformed(ActionEvent equalIt) {
	    		
	    		totaling();
	    		
	    	}
	    	
	    });
		
		
		
		
		//Adding number buttons to JFrame
	    window.add(one);
		window.add(two);
		window.add(three);
		window.add(four);
		window.add(five);
		window.add(six);
		window.add(seven);
		window.add(eight);
		window.add(nine);
		//Adding Outputs to JFrame
		window.add(output);
		//Adding Operation Buttons
		window.add(addingIt);
		window.add(subIt);
		window.add(timesIt);
		window.add(divIt);
		window.add(equalIt);
		window.add(totalString);
		window.setVisible(true);
		
	
}
	public static String oneing() {
		if(trans) {
			
			secondNumString = secondNumString + "1";
			System.out.println(secondNumString);
			output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
			return secondNumString;
		

	}else {
		firstNumString = firstNumString + "1";
		System.out.println(firstNumString);
		output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
		return firstNumString;
	}
}

	public static String twoing() {
		if(trans) {
			
			secondNumString = secondNumString + "2";
			System.out.println(secondNumString);
			output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
			return secondNumString;
		

	}else {
		firstNumString = firstNumString + "2";
		System.out.println(firstNumString);
		output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
		return firstNumString;
	}
}
	
	public static String threeing() {
		if(trans) {
			
			secondNumString = secondNumString + "3";
			System.out.println(secondNumString);
			output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
			return secondNumString;
		

	}else {
		firstNumString = firstNumString + "3";
		System.out.println(firstNumString);
		output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
		return firstNumString;
	}
		
}
	
	public static String fouring() {
		if(trans) {
			
			secondNumString = secondNumString + "4";
			System.out.println(secondNumString);
			output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
			return secondNumString;
		

	}else {
		firstNumString = firstNumString + "4";
		System.out.println(firstNumString);
		output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
		return firstNumString;
	}
}
	
	public static String fiveing() {
		if(trans) {
			
			secondNumString = secondNumString + "5";
			System.out.println(secondNumString);
			output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
			return secondNumString;
		

	}else {
		firstNumString = firstNumString + "5";
		System.out.println(firstNumString);
		output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
		return firstNumString;
	}
}
	
	public static String sixing() {
		if(trans) {
			
			secondNumString = secondNumString + "6";
			System.out.println(secondNumString);
			output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
			return secondNumString;
		

	}else {
		firstNumString = firstNumString + "6";
		System.out.println(firstNumString);
		output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
		return firstNumString;
	}
}
	
	public static String sevening() {
		if(trans) {
			
			secondNumString = secondNumString + "7";
			System.out.println(secondNumString);
			output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
			return secondNumString;
		

	}else {
		firstNumString = firstNumString + "7";
		System.out.println(firstNumString);
		output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
		return firstNumString;
	}
	}
		
		public static String eighting() {
			if(trans) {
				
				secondNumString = secondNumString + "8";
				System.out.println(secondNumString);
				output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
				return secondNumString;
			

		}else {
			firstNumString = firstNumString + "8";
			System.out.println(firstNumString);
			output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
			return firstNumString;
		}
	}
		
		public static String nineing() {
			if(trans) {
				
				secondNumString = secondNumString + "9";
				System.out.println(secondNumString);
				output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
				return secondNumString;
			

		}else {
			firstNumString = firstNumString + "9";
			System.out.println(firstNumString);
			output.setText("First Number: " + firstNumString + "          Second Number: " + secondNumString);
			return firstNumString;
		}
	}
		
		public static double totaling() {
			
			firstNum = Double.parseDouble(firstNumString);
			secondNum = Double.parseDouble(secondNumString);
			if(add) {
				total = firstNum + secondNum;
			} else if(sub) {
				total = firstNum - secondNum;
			} else if(times) {
				total = firstNum * secondNum;
			} else if(sub) {
				total = firstNum / secondNum;
			} 
			totalString.setText("Total: " + total);
			System.out.println(total);
			return total;

		}

	
}
