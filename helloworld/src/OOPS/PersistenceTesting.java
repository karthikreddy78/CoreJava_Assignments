package OOPS;

public class PersistenceTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence p= new FilePersistence();
		p.persist();
		Persistence p1= new DataPersistence();
		p1.persist();
	}

}
