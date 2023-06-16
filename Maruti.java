package work;

class Maruti extends Car{
	Engine MarutiEngine = null;
	public void MarutiStartDemo()
	{
		MarutiEngine = new Engine();
		MarutiEngine.start();
		System.out.println("Working: ");
		MarutiEngine.stop();
	}

}
