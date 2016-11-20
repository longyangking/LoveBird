import numpy as np

class Point:
    def __init__(self):
        self.x = 0
        self.y = 0
        self.z = 0
        self.Ex = 0
        self.Ey = 0
        self.Ez = 0
        self.Hx = 0
        self.Hy = 0
        self.Hz = 0
        #self.ExPhase = 0
        #self.EyPhase = 0
        #self.EzPhase = 0
        #self.HxPhase = 0
        #self.HyPhase = 0
        #self.HzPhase = 0

    def __init__(self,x,y,z,Ex,Ey,Ez,Hx,Hy,Hz):
        self.x = x
        self.y = y
        self.z = z
        self.Ex = Ex
        self.Ey = Ey
        self.Ez = Ez
        self.Hx = Hx
        self.Hy = Hy
        self.Hz = Hz
