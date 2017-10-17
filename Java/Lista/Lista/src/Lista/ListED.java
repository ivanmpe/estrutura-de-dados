package Lista;

public interface ListED{

	public void insert(Object element);
	public void insert(Object element, int pos);
	public Object getElement(int pos);
	public void remove(int pos);
	public int size();
	public boolean contains(Object element);

}