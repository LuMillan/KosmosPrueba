package la.kosmos.prueba

import grails.transaction.Transactional

@Transactional
class ContactoService {
    
    def save(def nombre,def correo,def numTelefonico,def empresa){
        String respuesta="contacto guardado"
        
        def contacto=new Contacto()
        contacto.nombre=nombre
        contacto.numTelefonico=numTelefonico
        contacto.correo=correo
        contacto.empresa=empresa
        
        if(contacto.save()){
            return respuesta
        }else{
            return "error al guardar"}
    }
    
    def getContacto(def nombre){
              def respuesta=""
        
            if(!nombre.isNumber()){
                def contacto=Contacto.findAllByNombre(nombre)
            
                if(contacto){
                    respuesta="<br>Nombre "+contacto.nombre+"<br> Correo "+contacto.correo+"<br> Telefono "+contacto.numTelefonico+"<br> Empresa "+contacto.empresa
                }else{
                    respuesta="No existe un contacto con ese nombre"
                }
            }else{
                def contacto=Contacto.findAllById(nombre)
                if(contacto){
                    respuesta="<br>Nombre "+contacto.nombre+"<br> Correo "+contacto.correo+"<br> Telefono "+contacto.numTelefonico+"<br> Empresa "+contacto.empresa
                }else{
                    respuesta="No existe un contacto con ese Id"
                }
            }
        

        return respuesta
        
    }
    
    def geetContacto(def nombre){
        def contacto=""
        
        if(!nombre.isNumber()){
             contacto=Contacto.findByNombre(nombre)
        }else{
             contacto=Contacto.get(nombre)
        }
        println(contacto.empresa)
       /*def empresa=Empresa.get(contacto.empresa)
        contacto.empresa=empresa.nombre*/
        return contacto
    }
    def getList(){
        
        return Contacto.list()
        
    }
    
    def updateContacto(params){
        Contacto contacto=Contacto.get(params.id)
        println(params.nombre)
        contacto.nombre=params.nombre
        contacto.correo=params.correo
        def empresa_obj=Empresa.findByNombreEmpresa(params.empresa)
        contacto.empresa=empresa_obj
        contacto.numTelefonico=params.telefono
        contacto.save()
    }
    
    def deleteContacto(def nombre){
        def respuesta=""
        
        if(!nombre.isNumber()){
            Contacto contacto=Contacto.findByNombre(nombre)
            
            if(contacto){
                contacto.delete()
                respuesta="Contacto borrado"
            }else{
                respuesta="No existe un contacto con ese nombre"
            }
        }else{
            def contacto=Contacto.get(nombre)
            if(contacto){
                contacto.delete()
                respuesta="Contacto borrado"
            }else{
                respuesta="No existe un contacto con ese Id"
            }
        }

        return respuesta
        
    }
        
    

    def serviceMethod() {

    }
}
