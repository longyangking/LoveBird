package model.fileformat;
import model.Model;
import model.Vector;
import model.Vertex;

import java.util.List;
import java.util.Iterator;

public class STL {
	private List<Facet> facets;
	private String filename;
	
	public STL(Model model){
		// TODO there are still a lot of works needed to be done.
	}
	
	/**
	 * Export STL in TXT file format
	 * @return
	 */
	public String exportSTL(){
		/*
		 * STL file format:------------
		 * solid name
		 * 	facet normal ni nj nk
				outer loop
       				vertex v1x v1y v1z
        			vertex v2x v2y v2z
        			vertex v3x v3y v3z
    			endloop
			endfacet
		 * endsolid name
		 */
		StringBuffer buffer = new StringBuffer();
		buffer.append(String.format("solid %s\n", filename));
		Iterator<Facet> iter = facets.iterator();
		while(iter.hasNext()){
			Facet facet = iter.next();
			buffer.append(facet);
		}
		buffer.append(String.format("endsolid %s\n", filename));
		return buffer.toString();
	}
	
	/**
	 * Define facet in STL
	 * @author longyang
	 *
	 */
	class Facet{
		private Vector normal; 
		private Vertex[] vertex;
		public Facet(Vector normal, Vertex[] vertex){
			this.setNormal(normal); this.setVertex(vertex);
		}
		public Vector getNormal() {
			return normal;
		}
		public void setNormal(Vector normal) {
			this.normal = normal.normalize();
		}
		public Vertex[] getVertex() {
			return vertex;
		}
		public void setVertex(Vertex[] vertex) {
			// TODO confirm the number of vertex shall be 3
			this.vertex = vertex;
		}
		@Override
		public String toString(){
			StringBuffer buffer = new StringBuffer();
			buffer.append(String.format(" facet normal %s\n", normal));
			buffer.append("  outer loop\n");
			for(int i = 0; i<3; i++){
				buffer.append(String.format("   vertex %s\n", vertex[i]));
			}
			buffer.append("  endloop\n");
			buffer.append(" endfacet\n");
			return buffer.toString();
		}
	}
}
