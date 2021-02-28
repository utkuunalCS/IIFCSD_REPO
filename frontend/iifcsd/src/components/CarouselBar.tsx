import React from "react";
import "../index.css";
import "bootstrap/dist/css/bootstrap.min.css";
import Carousel from "react-bootstrap/Carousel";
import styles from "./CarouselBar.module.scss";

const CarouselBar = () => (
  <Carousel className={styles.sliderPoint}>
    <Carousel.Item interval={6000}>
      <img
        className={styles.smoothView}
        src="images/shopping1.jpg"
        alt="Black Friday Is Coming!"
      />
      <Carousel.Caption>
        <h3>BLACK FRIDAY IS COMING!</h3>
        <p>FLASH DEALS IN ELECTRONICS, FASHION & OUTDOORS CATEGORIES</p>
      </Carousel.Caption>
    </Carousel.Item>
    <Carousel.Item interval={6000}>
      <img
        className={styles.smoothView}
        src="images/shopping3.jpg"
        alt="Flash Deals in Cell Phones!"
      />
      <Carousel.Caption>
        <h3>ELECTRONICS</h3>
        <p>FLASH DEALS IN CELL PHONES</p>
      </Carousel.Caption>
    </Carousel.Item>
    <Carousel.Item>
      <img
        className={styles.smoothView}
        src="images/shopping2.jpg"
        alt="AUTUMN/WINTER 2021 COLLECTION"
      />
      <Carousel.Caption>
        <h3>WOMEN'S FASHION</h3>
        <p>INTRODUCING THE AUTUMN/WINTER 2021 COLLECTION</p>
      </Carousel.Caption>
    </Carousel.Item>
  </Carousel>
);

export default CarouselBar;
