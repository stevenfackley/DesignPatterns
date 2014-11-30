/**
 * 
 */
package edu.ccsu.cs407.FinalProject.FileOperations;

import java.io.File;
import java.util.ArrayList;

import javax.swing.text.Document;


/**
 * @author ackleys
 *
 */
public interface FileOperator {

	Document ReadFile(File filename) throws Exception;
	void WriteToFile(org.w3c.dom.Document doc) throws Exception;
}
