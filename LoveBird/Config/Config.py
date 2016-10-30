class SystemConfig:
    '''
    This class contains the settings and configurations in LoveBird
    '''
    #Info of local cores for computation
    LocalCore = 1 #The Number of cores for computation
    LocalCoreMax = 16 #The Max number of cores for computation
    # TODO: LocalCoreMax shall be initiated automatically based on the specific machine

    @staticmethod
    def getLocalCore():
        '''
        Get the number of core for computation
        '''
        return LocalCore
    
    @staticmethod
    def setLocalCore(num):
        '''
        Set the number of core for computation
        '''
        if num > LocalCoreMax:
            LocalCore = LocalCoreMax
        else:
            LocalCore = num

    @staticmethod
    def getLocalCoreMax():
        '''
        Get the max number of core we can use
        '''
        return LocalCoreMax

    #Info of remote cores for computation
    RemoteCore = 0

    @staticmethod
    def getRemoteCore():
        '''
        Get the number of remote core
        '''
        return RemoteCore

    @staticmethod
    def setRemoteCore(num):
        '''
        Set the number of remote core
        '''
        RemoteCore = num

    #Info of temp folder
    TempFolder = ""

    @staticmethod
    def getTempFolder():
        '''
        Get the directory of temp folder
        '''
        return TempFolder

    @staticmethod
    def setTempFolder(folder):
        '''
        Set the directory of temp folder
        '''
        TempFolder = folder