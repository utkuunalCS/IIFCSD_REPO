import React from "react";
import "../index.css";
import "bootstrap/dist/css/bootstrap.min.css";
import styles from "./NavigatorBar.module.scss";
import Nav from "react-bootstrap/Nav";
import Navbar from "react-bootstrap/Navbar";
import Form from "react-bootstrap/Form";
import FormControl from "react-bootstrap/FormControl";
import Button from "react-bootstrap/Button";
import { Link } from "react-router-dom";
import { NavDropdown } from "react-bootstrap";

const NavigatorBar = () => (
  <div className={styles.navigatorBar}>
    <Navbar bg="dark" variant="dark">
      <Navbar.Brand as={Link} to="/">
        IIFCSD Systems
      </Navbar.Brand>
      <Nav className="mr-auto">
        <Nav.Link as={Link} to="/all">
          All
        </Nav.Link>
        <Nav.Link as={Link} to="/todaysdeals">
          Today's Deals
        </Nav.Link>
        <NavDropdown title="Categories" id="collasible-nav-dropdown">
          <NavDropdown.Item as={Link} to="/fashion">
            Fashion
          </NavDropdown.Item>
          <NavDropdown.Item as={Link} to="/electronics">
            Electronics
          </NavDropdown.Item>
          <NavDropdown.Item as={Link} to="/homeandkitchen">
            Home and Kitchen
          </NavDropdown.Item>
          <NavDropdown.Divider />
          <NavDropdown.Item as={Link} to="/giftcards">
            Gift Cards
          </NavDropdown.Item>
        </NavDropdown>
      </Nav>
      <Nav className="mr-sm-2">
        <Nav.Link as={Link} to="/login">
          Profile
        </Nav.Link>
        <Nav.Link as={Link} to="/chart">
          Chart
        </Nav.Link>
      </Nav>
      <Form inline>
        <FormControl type="text" placeholder="Search" className="mr-sm-2" />
        <Button variant="outline-info">Search</Button>
      </Form>
    </Navbar>
  </div>
);

export default NavigatorBar;
