class Animal:
    def comer(self):
        print("El animal eta comiendo")
        
class Ave(Animal):
    def volar(self):
        print("El animal eta volando")
        
class Mamifero(Animal):
    def amamantar(self):
        print("El animal eta amamantando")
        
class Murcielago(Mamifero,Ave):
    pass


ave = Ave()

ave.comer()
ave.volar()

print(Murcielago.mro())