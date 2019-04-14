
public class AdapterImpl implements Adapter {
	
	OldClass oldClass = new OldClass();

	@Override
	public void request() {
		System.out.println("===== Adapter Code =====");
		oldClass.request();
	}

}
