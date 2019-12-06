//内页框架
$(function() {
    $("#situation").Hupage({
        scrollbar: function(e) {
            e.niceScroll({
                cursorcolor: "#dddddd",
                cursoropacitymax: 1,
                touchbehavior: false,
                cursorwidth: "3px",
                cursorborder: "0",
                cursorborderradius: "3px",
            });
        },
        expand: function(thisBox, settings) {
            settings.scrollbar(thisBox); //设置当前页滚动样式
        }
    })
})

/*********************/
require.config({
    paths: {
        echarts: './js/dist'
    }
});
require(
    [
        'echarts',
        'echarts/theme/macarons',
        'echarts/chart/line', // 按需加载所需图表，如需动态类型切换功能，别忘了同时加载相应图表
        'echarts/chart/bar'
    ],
    function(ec, theme) {
        var myChart = ec.init(document.getElementById('main'), theme);
        option = {
            title: {
                text: '当周交易记录',
                subtext: '每周7天的交易记录'
            },
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                data: ['所有订单', '已完成', '未完成']
            },
            toolbox: {
                show: true,
                feature: {
                    mark: {
                        show: true
                    },
                    dataView: {
                        show: true,
                        readOnly: false
                    },
                    magicType: {
                        show: true,
                        type: ['line', 'bar']
                    },
                    restore: {
                        show: true
                    },
                    saveAsImage: {
                        show: true
                    }
                }
            },
            calculable: true,
            xAxis: [{
                type: 'category',
                boundaryGap: false,
                data: ['周一', '周二', '周三', '周四', '周五', '周六', '周日']
            }],
            yAxis: [{
                type: 'value',
                axisLabel: {
                    formatter: '{value}单'
                }
            }],
            series: [{
                name: '所有订单',
                type: 'line',
                data: [110, 210, 150, 130, 125, 133, 106],
                markPoint: {
                    data: [{
                        type: 'max',
                        name: '最大值'
                    },
                        {
                            type: 'min',
                            name: '最小值'
                        }
                    ]
                },
                markLine: {
                    data: [{
                        type: 'average',
                        name: '平均值'
                    }]
                }
            },
                {
                    name: '已完成',
                    type: 'line',
                    data: [110, 105, 140, 130, 110, 121, 100],
                    markPoint: {
                        data: [{
                            name: '周最低',
                            value: -2,
                            xAxis: 1,
                            yAxis: -1.5
                        }]
                    },
                    markLine: {
                        data: [{
                            type: 'average',
                            name: '平均值'
                        }]
                    }
                },
                {
                    name: '未完成',
                    type: 'line',
                    data: [0, 25, 10, 10, 15, 12, 6],
                    markPoint: {
                        data: [{
                            name: '周最低',
                            value: -2,
                            xAxis: 1,
                            yAxis: -1.5
                        }]
                    },
                    markLine: {
                        data: [{
                            type: 'average',
                            name: '平均值'
                        }]
                    }
                }
            ]
        };

        myChart.setOption(option);
    }
);