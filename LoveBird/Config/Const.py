import math
class PhysicsConst:
    '''
    This class contains frequently used physical constant values
    
    Epsilon0: The permittivity of vacuum (unit: F/m)

    Mu0: The permeability of vaccum (unit: H/m)

    C: The speed of light in vaccum (unit: m/s)
    
    Eta0: The wave impedance of vaccum (unit: V/A)
    '''
    Epsilon0 = 8.854187817*10**-12
    Mu0 = 4.0*math.pi*10**-7
    C = 299792458
    Eta0 = 377

class SystemConst:
    '''
    This class contains the system information about LoveBird
    
    Version: System version
    '''
    Version = '0.0.1'
    
