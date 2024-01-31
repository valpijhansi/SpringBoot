package spingframeWork;

public class PetrolEng implements IEngine {
	
	public PetrolEng() {
		System.out.println("PetrolEng::Constructor");
	}

	@Override
	public boolean start() {
		System.out.println("Journey Started");
		return true;
		
		
	}

}
