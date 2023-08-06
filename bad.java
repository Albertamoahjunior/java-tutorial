import	java.io.File; import	java.util.Scanner;
public	class	Main	{
		public	static	void	main(String[]	args) throws FileNotFoundException	{				Scanner	diskScanner	=	new	Scanner(new	File("numbers.txt"));
				int[]	numerators	=	new	int[5];				int[]	denominators	=	new	int[5];				int	i	=	0;				while	(diskScanner.hasNextInt())	{						numerators[i]	=	diskScanner.nextInt();						denominators[i]	=	diskScanner.nextInt();						i++;				}
				for	(int	j	=	0;	j	<	numerators.length;	j++)	{						System.out.println(numerators[j]	/	denominators[j]);				}
				diskScanner.close();		} } 