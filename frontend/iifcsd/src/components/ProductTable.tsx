import React from "react";
import { makeStyles } from "@material-ui/core/styles";
import Box from "@material-ui/core/Box";
import Collapse from "@material-ui/core/Collapse";
import IconButton from "@material-ui/core/IconButton";
import Table from "@material-ui/core/Table";
import TableBody from "@material-ui/core/TableBody";
import TableCell from "@material-ui/core/TableCell";
import TableContainer from "@material-ui/core/TableContainer";
import TableHead from "@material-ui/core/TableHead";
import TableRow from "@material-ui/core/TableRow";
import Typography from "@material-ui/core/Typography";
import Paper from "@material-ui/core/Paper";
import KeyboardArrowDownIcon from "@material-ui/icons/KeyboardArrowDown";
import KeyboardArrowUpIcon from "@material-ui/icons/KeyboardArrowUp";
import styles from "./ProductTable.module.scss";

export interface ProductInfo {
    category: string;
    expiryDate: Date;
    imgPath: string;
    name: string;
    price: number;
    rate: number;
    serialNumber: number;
    stockAmount: number;
    vendor: string;
    history: [];
}

const useRowStyles = makeStyles({
  root: {
    "& > *": {
      borderBottom: "unset",
    },
  },
});

function Row(props: { row: ProductInfo }) {
  const { row } = props;
  const [open, setOpen] = React.useState(false);

  return (
    <React.Fragment>
      <TableRow className={styles.root}>
        <TableCell>
          <IconButton
            aria-label="expand row"
            size="small"
            onClick={() => setOpen(!open)}
          >
            {open ? <KeyboardArrowUpIcon /> : <KeyboardArrowDownIcon />}
          </IconButton>
        </TableCell>
        <TableCell>
          <img
            className={styles.smoothView}
            src= {row.imgPath}
            alt= {row.imgPath}
          />
        </TableCell>
        <TableCell component="th" scope="row">
          {row.name}
        </TableCell>
        <TableCell align="left">{row.price}</TableCell>
        <TableCell align="left">{row.rate}</TableCell>
        <TableCell align="left">{row.vendor}</TableCell>
        <TableCell align="left">{row.category}</TableCell>
        <TableCell align="left">{row.stockAmount}</TableCell>
      </TableRow>
      <TableRow>
        <TableCell style={{ paddingBottom: 0, paddingTop: 0 }} colSpan={6}>
          <Collapse in={open} timeout="auto" unmountOnExit>
            <Box margin={1}>
              <Typography variant="h6" gutterBottom component="div">
                History
              </Typography>
              <Table size="small" aria-label="purchases">
                <TableHead>
                  <TableRow>
                    <TableCell>Date</TableCell>
                    <TableCell>Customer</TableCell>
                    <TableCell align="right">Amount</TableCell>
                    <TableCell align="right">Total price ($)</TableCell>
                  </TableRow>
                </TableHead>
                {/* <TableBody>
                  {row.history.map((historyRow) => (
                    <TableRow key={historyRow.date}>
                      <TableCell component="th" scope="row">
                        {historyRow.date}
                      </TableCell>
                      <TableCell>{historyRow.customerId}</TableCell>
                      <TableCell align="right">{historyRow.amount}</TableCell>
                      <TableCell align="right">
                        {Math.round(historyRow.amount * row.price * 100) / 100}
                      </TableCell>
                    </TableRow>
                  ))}
                </TableBody> */}
              </Table>
            </Box>
          </Collapse>
        </TableCell>
      </TableRow>
    </React.Fragment>
  );
}

function ProductTable( props: { products: ProductInfo[] } ) {
  const classes = useRowStyles();
  return (
    <div className={classes.root}>
      <TableContainer component={Paper}>
        <Table aria-label="collapsible table">
          <TableHead>
            <TableRow>
              <TableCell />
              <TableCell />
              <TableCell>Product Name</TableCell>
              <TableCell align="left">Price</TableCell>
              <TableCell align="left">Rate</TableCell>
              <TableCell align="left">Vendor</TableCell>
              <TableCell align="left">Category</TableCell>
              <TableCell align="left">Stock Amount</TableCell>
            </TableRow>
          </TableHead>
          <TableBody>
            {props.products.map((row) => (
              <Row key={row.serialNumber} row={row} />
            ))}
          </TableBody>
        </Table>
      </TableContainer>
    </div>
  );
}

export default ProductTable;
