package la.kosmos.prueba

class ContactoController {
    def contactoService
    
    def index() {render (view:"contacto") }
    def buscarContacto(){render(view:"buscarContacto")}
    def eliminarContacto(){render(view:"dropContacto")}
    
    def save(){
        
        def nombre=params.nombre
        def correo=params.correo
        def telefono=params.numTelefonico
        def empresa_obj=Empresa.get(params.empresa)
        def empresa=empresa_obj
        String respuesta=contactoService.save(nombre,correo,telefono,empresa)
        render respuesta
    }
    
    def getContacto(){
        String respuesta=contactoService.getContacto(params.nombre)
        render respuesta
    }
    
    def updateContacto(){
        
        
    }
    
    def deleteContacto(){
        String respuesta=contactoService.deleteContacto(params.nombre)
        render respuesta
        
    }
    
    
}
