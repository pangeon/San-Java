package rtv;

public interface TV {
	void setProgram(Program p);
	
	void changeVolume(int delta);
	
	void changeBritness(int delta);
}
