import math

class Vector(object):
    X = 0
    Y = 0
    Z = 0
    def __init__(self,x,y,z):
        self.X = x
        self.Y = y
        self.Z = z

    def normalize(self):
        norm = math.sqrt(self.X**2+self.Y**2+self.Z**2)
        return Vector(self.X/norm,self.Y/norm,self.Z/norm)

    def toString(self):
        return '{x} {y} {z}'.format(x=self.X,y=self.Y,z=self.Z)