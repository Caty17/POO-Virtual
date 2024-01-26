from abc import ABC, abstractmethod

class VerificadorOrtografico(ABC):
    @abstractmethod
    def verificra_palabra(self,palabra):
        pass

class Diccionario(VerificadorOrtografico):
    def verificra_palabra(self,palabra):
        #logica para verificar palabras si esta en el diccionario
        pass

class CorrectorOrtografico:
    def __init__(self,verificador):
        self.verificador = verificador
        
    def corregir_texto(self, texto):
        #usamos el verificador para corregir texto
        self.texto = texto

corrector = CorrectorOrtografico(Diccionario())