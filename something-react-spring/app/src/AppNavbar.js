import React, { Component } from 'react';
import { Collapse, Nav, Navbar, NavbarBrand, NavbarToggler, NavItem, NavLink } from 'reactstrap';
import { Link } from 'react-router-dom';

export default class AppNavbar extends Component {
    constructor(props) {
        super(props);
        this.state = {isOpen: false};
        this.toggle = this.toggle.bind(this);
    }

    toggle() {
        this.setState({
            isOpen: !this.state.isOpen
        });
    }

    render() {
        return <Navbar color="dark" dark expand="md">
            <NavbarBrand tag={Link} to="/">Home</NavbarBrand>
            <NavbarToggler onClick={this.toggle}/>
        <Collapse isOpen={this.state.isOpen} navbar>
        <Nav className="ml-auto" navbar>
        <NavItem>
        <NavLink
        href="https://twitter.com/oktadev">@oktadev</NavLink>
        </NavItem>
        <NavItem>
        <NavLink href="https://github.com/oktadeveloper/okta-spring-boot-react-crud-example">GitHub</NavLink>
            </NavItem>
            </Nav>
            </Collapse>
            </Navbar>;
    }
}
Create app/src/Home.js to serve as the landing page for your app.

    import React, { Component } from 'react';
import './App.css';
import AppNavbar from './AppNavbar';
import { Link } from 'react-router-dom';
import { Button, Container } from 'reactstrap';

class Home extends Component {
    render() {
        return (
            <div>
            <AppNavbar/>
            <Container fluid>
        <Button color="link"><Link to="/groups">Manage JUG Tour</Link></Button>
        </Container>
        </div>
    );
    }
}

export default Home;
