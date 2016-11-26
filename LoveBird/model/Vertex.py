class Vertex(object):
    X = 0
    Y = 0
    Z = 0
    def Vertex(self,x,y,z):
        self.X = x
        self.Y = y
        self.Z = z

    def toString(self):
        return '{x} {y} {z}'.format(x=self.X,y=self.Y,z=self.Z)