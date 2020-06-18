package materials;

public class Product1 {
	public boolean isFragile(MaterialTypes material){
		switch (material){
		case GLASS:
			System.out.println("made of glass");
			return true;
		case WOOD:
			System.out.println("made of wood");
			return false;	
		case PLASTIC:
			System.out.println("made of plastic");
			return false;	
		default:
			System.out.println("made of some hard material");
			return false;
		}		
	}
}

