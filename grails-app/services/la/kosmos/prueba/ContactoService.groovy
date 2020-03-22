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
    
    def geetContacto(def p){
        
        if(!nombre.isNumber()){
            def contacto=Contacto.findAllByNombre(p)
        }else{
            def contacto=Contacto.findAllById(p)
        }
        return contacto
    }
    
    def updateContacto(Contacto datosOriginales, Contacto datosNuevos){
        Contacto original=geetContacto(param)
        Contacto nuevo=Contacto.get(original.id)
        nuevo=datosNuevos
        nuevo.save       
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
            def contacto=Contacto.findByNombre(nombre)
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
