import React, { useState, useEffect, Component, Fragment } from 'react';
import goodfriday from '../goodfriday.jpg';




class Page1 extends Component {

    constructor(props) {
        super(props);
        this.state = {
            items: [],
            isLoaded: false,
        }
    }
    
    componentDidMount() {
        fetch('https://cps530-exam.herokuapp.com/pageone')
            .then(res => res.json())
            .then(json => {
                this.setState({
                    isLoaded: true,
                    items: json,
                })
            });
    }

    render() {

        var { isLoaded, items } = this.state;

        if (!isLoaded)
        {
            return <div>Loading...</div>
        }
        else{
        
        return (
            <div style={{color:"white", marginTop:"50px", marginLeft:"50px", marginRight:"50px"}}> 
            <h2>
                When is Good Friday 2022?
            </h2>
            {items.map(item => (
                    <div>{item.pageData}</div>
                ))};
                <img src={goodfriday} style={{marginTop:"20px"}}/>
            <br/>
   
        
            </div>
          
        );
        }
    }
}


export default Page1;
