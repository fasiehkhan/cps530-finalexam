import React, { Component } from 'react';
import { Navbar, Nav, Container } from 'react-bootstrap';


export default class NavbarComp extends Component {
   render() {
       return (
           <div>
               <Navbar bg="primary" variant="dark">
                   <Container>
                   <Navbar.Brand href="#home">CPS530 FINAL EXAM</Navbar.Brand>
                   <Nav className="me-auto">

                   </Nav>
                   </Container>
               </Navbar>
           </div>
 
       )
   }
}
 
 
