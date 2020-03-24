package la.kosmos.prueba

class ContactoController {
    def contactoService
    
    def index() {render (view:"contacto") }
    def buscarContacto(){render(view:"buscarContacto")}
    def eliminarContacto(){render(view:"dropContacto")}
    def editarContacto(){        
        def modelo=[:]
        
        modelo.nombre="Juanita"
        modelo.edad=25
        modelo.telefono="333333333"
        modelo.ejemplo = "ejemplo"
        modelo.lista = contactoService.getList()
        println "lista : " + modelo.lista
        
        
        println " pasa por sumar con modelo : " + modelo
        render (view : "editarContacto" , model:modelo )
        }
    
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
    
    def geetContacto(){
        def modelo=[:]
        modelo.nombre=contactoService.geetContacto(params.nombre)
        //println(modelo.nombre.empresa)
        //println(modelo.nombre)
        //def empresa_obj=Empresa.get(modelo.nombre.empresa)
        //modelo.empresa=empresa_obj.nombre
        
        render (view : "editar2" , model:modelo)
    }
    
    def updateContacto(){
        def editar=contactoService.updateContacto(params)
       
        render "contacto actualizado"

    }
    
    def deleteContacto(){
        String respuesta=contactoService.deleteContacto(params.nombre)
        render respuesta
    }
    
    
}
