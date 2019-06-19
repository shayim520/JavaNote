package day60;

public class Smart_Tv extends Tv{
	
	int channelCount = 200; 
	
	@Override
	public int getChannelCount() {
		// TODO Auto-generated method stub
		return channelCount;
	}
    @Override
	public void play() {
		System.out.println("playing smart");
	}
    public static void doTvStatic() {
    	System.out.println("do smart Tv Static");
    }
	
	public static void main(String[] args) {
		
		Tv tv1 = new Smart_Tv();
		System.out.println(tv1.channelCount);
		tv1.play();
		System.out.println(tv1.getChannelCount());
		System.out.println(new Smart_Tv().getChannelCount());
		tv1.doTvStatic();
	}

}
