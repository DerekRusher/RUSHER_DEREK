public class FixOrRepairDaily
{
	private String paint, interior, engine, tires;
	
	public FixOrRepairDaily(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	public void setCustum(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	public String getPaint()
	{
		return paint;
	}
	
	public String getInterior()
	{
		return interior;
	}
	
	public String getEngine()
	{
		return engine;
	}
	
	public String getTires()
	{
		return tires;
	}
}