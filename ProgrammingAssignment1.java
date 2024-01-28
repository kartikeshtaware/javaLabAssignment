class SY2023bit504{
	
	public static void main(String args[]){
		String arg[] = {"2024bit003","2022bch001","2023bmh003"};
		SY2023bit504 s1 = new SY2023bit504();
		System.out.println(s1.getValidRegistrations(arg));
	}
	
	public int getValidRegistrations(String registrations[]){
		int count = 0;
		
		
		for(int i =0; i<registrations.length;i++){
			int count1 = registrations[i].length();
			 
			 if(count1 == 10){
			 
			 	String str1 = registrations[i].substring(0,4);
			 	for(int j = 2000; j<=2024;j++){
			 	
			 		
			 		
			 		String s=Integer.toString(j);
			 		
			 		if(str1.equals(s)){
			 		   
			 			
			 			String str2 = registrations[i].substring(4,7);
			 			if(str2.equals("bit") || str2.equals("bch") || str2.equals("bcs") || str2.equals("bmh") || str2.equals("BIT") || str2.equals("BCH") || str2.equals("BCS")  || str2.equals("BMH")){
			 				
			 				String str3 = registrations[i].substring(7,10);
			 				
			 				int inn = Integer.parseInt(str3);
			 				if(inn>000 && inn<999){
			 					count++;
			 				}
			 				
			 				
			 			} 		
			 		}
			 		
			 	}
			 	
			 		
			 }
			 
		}
		
		return count; 
	}
}
