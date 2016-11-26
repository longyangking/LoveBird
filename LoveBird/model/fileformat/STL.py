import sys
sys.path.append("..")
import Vertex
import Vector
import Model

class STL(object):
    facets = list()
    filename = ''

    def __init__(self,model):
        self.model = model

    '''
    Export STL in TXT file format
    '''
    def exportSTL(self):
        '''
		STL file format:------------
		solid name
		 facet normal ni nj nk
		    outer loop
       	        vertex v1x v1y v1z
                vertex v2x v2y v2z
                vertex v3x v3y v3z
    	    endloop
		 endfacet
		endsolid name
		'''
        buffer = list()
        buffer.append("solid {solid}\n".format(solid=self.filename))
        for facet in self.facets:
            buffer.append(fact.toString())
        buffer.append("endsolid {solid}\n".format(solid=self.filename))
        return "".join(buffer)

class Facet(object):
    def __init__(self,normal,vertex):
        self.normal = normal.normalize()
        self.vertex = vertex
    
    def toString(self):
        buffer = list()
        buffer.append(" facet normal {normal}\n".format(normal=self.normal))
        buffer.append("  outer loop\n")
        for i in range(3):
            buffer.append("   vertex {vertex}\n".format(vertex=self.vertex[i]))
        buffer.append("  endloop\n")
        buffer.append(" endfacet\n")
        return "".join(buffer)