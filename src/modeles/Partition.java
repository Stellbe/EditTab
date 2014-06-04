package modeles;

import java.awt.List;

public class Partition {
	private String pName;
	private List pNotesList;
	
	public Partition(String name, List notesList) {
		this.setpName(name);
		this.setpNotesList(notesList);
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public List getpNotesList() {
		return pNotesList;
	}

	public void setpNotesList(List pNotesList) {
		this.pNotesList = pNotesList;
	}
	
}
