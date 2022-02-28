public class Book{
	String _title;
	String _author;
	String _publisher;
	String _copyright;
	
	public Book(String title,String author,String publisher,String copyright)
	{
		 _title=title;
		 _author=author;
		_publisher=publisher;
		_copyright=copyright;
	}

	public String get_title() {
		return _title;
	}

	public void set_title(String _title) {
		this._title = _title;
	}

	public String get_author() {
		return _author;
	}

	public void set_author(String _author) {
		this._author = _author;
	}

	public String get_publisher() {
		return _publisher;
	}

	public void set_publisher(String _publisher) {
		this._publisher = _publisher;
	}

	public String get_copyright() {
		return _copyright;
	}

	public void set_copyright(String _copyright) {
		this._copyright = _copyright;
	}

	@Override
	public String toString() {
		
		return "Title:"+_title+"\n" + "Author:" +_author+ "\n" + "publisher:" + _publisher+ "\n"+"copyright:" +_copyright +"\n\n";
	}

	
	
	
	
	
}