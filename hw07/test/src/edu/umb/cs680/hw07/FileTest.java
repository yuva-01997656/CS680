package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FileTest {
	private String[] stringarraytocompare(File f) {
		Optional<Directory> optionalDirectory = Optional.ofNullable(f.getParent());
		String[] fileInfo = { Boolean.toString(f.isDirectory()), f.getName(), 
				Integer.toString(f.getSize()), f.getCreationTime().toString(), 
				optionalDirectory.isPresent()?f.getParent().getName():null};
		return fileInfo;
	}
	static LocalDateTime localTime = LocalDateTime.now();
	
	@SuppressWarnings("unused")
	@BeforeAll
	public static void directoryandfilecreation() {
		Directory root = new Directory(null, "root", 0, localTime);
		Directory applications = new Directory(root, "applications", 0, localTime);
		Directory home = new Directory(root, "home", 0, localTime);
		Directory code = new Directory(home, "code", 0, localTime);
		File a = new File(applications, "a", 1300, localTime);
		File b = new File(applications, "b", 350, localTime);
		File c = new File(home, "c", 500, localTime);
		File d = new File(home, "d", 700, localTime);
		File e = new File(code, "e", 70, localTime);
		File f = new File(code, "f", 130, localTime);
		//creating files and addding the root directory
		FileSystem.getFileSystem().addRootDir(root);
	}
	
	
	@Test
	public void verifyFileEqualityA() {
		FileSystem f = FileSystem.getFileSystem();
		String[] expected = { "false", "a", "1300", localTime.toString(), "applications" };
		File actual = f.getRootDirs().get(0).findByName_File("a");
		assertArrayEquals(expected,stringarraytocompare(actual));
	}
	
	@Test
	public void verifyFileEqualityB() {
		FileSystem f = FileSystem.getFileSystem();
		String[] expected = { "false", "b", "350", localTime.toString(), "applications" };
		File actual = f.getRootDirs().get(0).findByName_File("b");
		assertArrayEquals(expected,stringarraytocompare(actual));
	}
	
	@Test
	public void verifyFileEqualityC() {
		FileSystem f = FileSystem.getFileSystem();
		String[] expected = { "false", "c", "500", localTime.toString(), "home" };
		File actual = f.getRootDirs().get(0).findByName_File("c");
		assertArrayEquals(expected,stringarraytocompare(actual));
	}

	
	
	
	@Test
	void TestforDirectory() {
		FileSystem f = FileSystem.getFileSystem();
		assertTrue(f.getRootDirs().get(0).findByName_Directory("root").isDirectory());
		assertTrue(f.getRootDirs().get(0).findByName_Directory("home").isDirectory());
		assertTrue(f.getRootDirs().get(0).findByName_Directory("applications").isDirectory());
		assertTrue(f.getRootDirs().get(0).findByName_Directory("code").isDirectory());
		assertFalse(f.getRootDirs().get(0).findByName_File("a").isDirectory());
		assertFalse(f.getRootDirs().get(0).findByName_File("b").isDirectory());
		assertFalse(f.getRootDirs().get(0).findByName_File("c").isDirectory());
		assertFalse(f.getRootDirs().get(0).findByName_File("d").isDirectory());
		assertFalse(f.getRootDirs().get(0).findByName_File("e").isDirectory());
		assertFalse(f.getRootDirs().get(0).findByName_File("f").isDirectory());
	}
	@Test
	void TestforDirectoryroot() {
		FileSystem f = FileSystem.getFileSystem();
		assertTrue(f.getRootDirs().get(0).findByName_Directory("root").isDirectory());
	}
}
