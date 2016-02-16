package org.shiftleft.test.hamcrest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class BookMatcher {

	public static Matcher<Book> hasIsbn(final String isbn) {
		return new TypeSafeMatcher<Book>() {

			@Override
			public void describeTo(final Description description) {
				description.appendText("expected result from getIsbn(): ")
						.appendValue(isbn);
			}

			@Override
			protected boolean matchesSafely(Book book) {
				return isbn.equals(book.getIsbn());
			}

			@Override
			protected void describeMismatchSafely(Book book,
					Description mismatchDescription) {
				super.describeMismatchSafely(book, mismatchDescription);
				mismatchDescription.appendText("was ").appendValue(
						book.getIsbn());
			}

		};
	}

	public static Matcher<Book> hasId(final Long id) {
		return new TypeSafeMatcher<Book>() {

			@Override
			public void describeTo(Description description) {
				description.appendText("expected result from getId(): ")
						.appendValue(id);

			}

			@Override
			protected void describeMismatchSafely(Book book,
					Description mismatchDescription) {
				super.describeMismatchSafely(book, mismatchDescription);
				mismatchDescription.appendText("was ")
						.appendValue(book.getId());

			}

			@Override
			protected boolean matchesSafely(Book book) {
				return id == book.getId();
			}

		};
	}

	public static Matcher<Book> hasSize(final Integer isbnLength) {
		return new TypeSafeMatcher<Book>() {

			@Override
			public void describeTo(final Description description) {

				description.appendText(
						"expected result from verifyIsbnSize(): ").appendValue(
						isbnLength);
			}

			@Override
			protected boolean matchesSafely(Book book) {
				return isbnLength == book.getIsbn().length();
			}

			@Override
			protected void describeMismatchSafely(Book book,
					Description mismatchDescription) {
				super.describeMismatchSafely(book, mismatchDescription);
				mismatchDescription.appendText("was ").appendValue(
						book.getIsbn().length());
			}
		};
	}
	

}
