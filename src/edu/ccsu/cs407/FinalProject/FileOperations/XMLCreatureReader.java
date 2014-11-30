/**
 * 
 */
package edu.ccsu.cs407.FinalProject.FileOperations;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import edu.ccsu.cs407.FinalProject.CreatureParts.CreatureComponent;
import edu.ccsu.cs407.FinalProject.Creatures.Creature;



/**
 * @author ackleys
 *
 */
public class XMLCreatureReader  {
	
	public Document ReadFile(File filename) throws Exception{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder(); 
		Document doc = (Document) db.parse(filename);
		return doc;

	}


	public void WriteToFile(Creature creature) throws Exception {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		
		//root elements
		Document doc1 = (Document) docBuilder.newDocument();
		Element rootElement = doc1.createElement("Game");
		
		//creature
		ArrayList<CreatureComponent> listOfComponents = creature.getCreatureComponents();
		
		for(CreatureComponent item:listOfComponents){
			Element el = doc1.createElement(item.getClass().toString());
			
		}
	}

}
