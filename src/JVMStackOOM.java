

public class JVMStackOOM {
	public static int count=0;
	private void dontStop(){
		while(true){
			
		}
	}
	
	public void stackLeakThread(){
		while(count<10){
			Thread thread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					System.out.println("ThreadCount = "+count++);
					dontStop();
				}
			});
			
			thread.start();
		}
	}
	
	public static void main(String []args){

		JVMStackOOM oom = new JVMStackOOM();
		oom.stackLeakThread();
		
	}
}
