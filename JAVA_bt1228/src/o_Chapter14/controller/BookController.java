package o_Chapter14.controller;

import java.util.ArrayList;
import java.util.List;

import o_Chapter14.model.Book;

// Book 데이터를 사용

public class BookController {
	private List<Book> books;
	
	public BookController() {
		this.books = new ArrayList<Book>();
	}
	
	public void addBook(String title, String author, String publisher) {
		Book newBook = new Book(title, author, publisher);
		books.add(newBook);
		}
	
	// 책의 리스트를 반환하는 기능
	public List<Book> getAllBooks(){
		return books;
	}
	
	public List<Book> searchBook(String title){
		List<Book> result = new ArrayList<Book>();
		//books 배열의 요소를 처음부터 끝까지 순환
		
		for(Book book : books) {
			if(book.getTitle().contains(title)) {
				result.add(book);
			}
		}
		return result;
	}
}
