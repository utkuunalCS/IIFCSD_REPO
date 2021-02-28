import React, { useEffect } from "react";
import "./App.css";
import Navigator from "./containers/Navigator";
import CarouselPanel from "./containers/CarouselPanel";
import ProductPanel from "./containers/ProductPanel";
import LoginScreen from "./containers/LoginScreen";
import {
  BrowserRouter,
  Route,
  Switch,
  Redirect,
  Router,
  Link,
} from "react-router-dom";
import { Carousel } from "react-bootstrap";

const loginStatus = {
  islogged: false,
};

function Home() {
  return (
    <>
      <CarouselPanel />
      <ProductPanel />
    </>
  );
}
const RoutedApp = () => (
  <Switch>
    <Route path="/login" render={() => <LoginScreen />} />
    <Route path="/" render={() => <Home />} />

    {/* <Route exact path="/" render={() => (<Redirect to="/" />)} /> */}
  </Switch>
);

const App = () => {
  return (
    <>
      <Navigator />
      <RoutedApp />
    </>
  );
};

export default App;
