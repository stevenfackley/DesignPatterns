/**
 * 
 */
package edu.ccsu.cs407.FinalProject.FileOperations;

import java.awt.List;
import java.io.File;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException; 
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.*;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import edu.ccsu.cs407.FinalProject.Creatures.Creature;

import org.w3c.dom.DocumentType;
import org.w3c.dom.Entity;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/**
 * @author ackleys
 *
 */
public class XMLCreatureReader implements FileOperator {
	
	public Document ReadFile(File filename) throws Exception{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder(); 
		Document doc = (Document) db.parse(filename);
		return doc;

	}

	@Override
	public void WriteToFile(Document doc) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
