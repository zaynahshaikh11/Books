
public class Book 
{
		private String title, author, publisher;
		private int copyrightYear; 

		public Book(String defaultTitle, String defaultAuthor, String defaultPublisher, int defaultCopyrightYear)
		{
				if(!defaultTitle.isEmpty())
				{
					title = defaultTitle;
				}
				else
				{
					System.out.println("Error- invalid input.");
				}
				///////////////
				if(!defaultAuthor.isEmpty())
				{
					author = defaultAuthor;
				}
				else
				{
					System.out.println("Error- invalid input.");
				}
				///////////////
				//           //
				///////////////
				
				if(!defaultPublisher.isEmpty())
				{
					publisher = defaultPublisher;
				}
				else
				{
					System.out.println("Error- invalid input.");
				}
				////////////
				//        //
				////////////
			if(defaultCopyrightYear < 0)
			{
				System.out.println("Error- invalid input.");
			}
			else
			{
				copyrightYear = defaultCopyrightYear;
			}
		}

		public void setTitle(String defaultTitle)
		{
			if(!defaultTitle.isEmpty())
			{
				title = defaultTitle;
			}
			else
			{
				System.out.println("Error- invalid input.");
			}
		}

		public void setAuthor(String defaultAuthor)
		{
			if(!defaultAuthor.isEmpty())
			{
				author = defaultAuthor;
			}
			else
			{
				System.out.println("Error- invalid input.");
			}
			
		}
		
		public void setcopyrightYear(int defaultCopyrightYear)
		{
			if(defaultCopyrightYear < 0)
			{
				System.out.println("Error- invalid input.");
			}
			else
			{
				copyrightYear = defaultCopyrightYear;
			}
		}
		
		public void setPublisher(String defaultPublisher)
		{
			if(!defaultPublisher.isEmpty())
			{
				publisher = defaultPublisher;
			}
			else
			{
				System.out.println("Error- invalid input.");
			}
			
		}
		
		public String getTitle()
		{
			return title;
		}

		public String getAuthor()
		{
			return author;
		}
		
		public String getPublisher()
		{
			return publisher;
		}

		public int getcopyrightYear()
		{
			return copyrightYear;
		}

		public String toString()
		{
			return "Book: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher + "\nCopyright Year: " + copyrightYear;
		}

}
